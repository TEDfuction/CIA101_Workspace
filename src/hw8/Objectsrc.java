package hw8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Objectsrc {
//請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Data");
		// 檢查目錄是否存在
		if (!file.exists()) {
			// 如果目錄不存在，則創建目錄
			file.mkdir();
		}
		// 創建檔案輸出流，用於將物件寫入到檔案中
		FileOutputStream fos = new FileOutputStream("C:\\Data\\Object.ser");
		// 創建物件輸出流，用於將物件序列化後寫入到檔案中
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// 創建兩個寵物物件：一隻貓和一隻狗
		Cat cat1 = new Cat("123456");
		Cat cat2 = new Cat("654321");
		Dog dog1 = new Dog("456789");
		Dog dog2 = new Dog("789654");
		// 將貓狗物件序列化後寫入到檔案中
		oos.writeObject(cat1);
		oos.writeObject(cat2);
		oos.writeObject(dog1);
		oos.writeObject(dog2);
		oos.close();
		fos.close();
		
	}

}
