package hw8;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Objectspeak {
//承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 (請利用多
//型簡化本題的程式設計)
	public static void main(String[] args) throws IOException {
		// 創建檔案輸入流，用於讀取序列化的物件檔案
		FileInputStream fis = new FileInputStream("C:\\Data\\Object.ser");
		// 創建物件輸入流，用於讀取序列化的物件
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			// 讀取物件，直到到達檔案結尾
			while (true) {
				// 將讀取的物件轉換為 Animal 類型，並調用 speak() 方法
				((Animal) ois.readObject()).speak();
			}
		// 捕捉到 EOFException 表示已經到達檔案結尾
		} catch (EOFException e) {
			System.out.println("end");
		// 捕捉可能發生的 ClassNotFoundException 或 IOException 異常
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		ois.close();
		fis.close();
	}

}
