package hw8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copyfile {
//請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//代表的檔案會複製到第二個參數代表的檔案
	public static void copyfile(String s1, String s2) throws IOException {
		// 創建檔案輸入流，讀取來源檔案 s1
		FileInputStream fis = new FileInputStream(s1);
		// 創建檔案輸出流，寫入目標檔案 s2
		FileOutputStream fos = new FileOutputStream(s2);
		// 創建緩衝區，用於暫存資料
		byte buffer[] = new byte[1024];
		int byteread;
		// 從來源檔案讀取資料，並寫入目標檔案
		while ((byteread = fis.read(buffer)) != -1) {
			fos.write(buffer, 0, byteread);// 寫入緩衝區中的資料到目標檔案
		}
		fis.close();
		fos.close();
	}

	public static void main(String[] args) {
		try {
			// 呼叫 copyfile 方法，傳入來源檔案路徑 s1 和目標檔案路徑 s2
			copyfile("C:\\Sample\\s1.txt", "C:\\Sample\\s2.txt");
			System.out.println("檔案成功複製");
		} catch (IOException e) {
			System.out.println("複製檔案發生錯誤" + e.getMessage());
		}
	}

}
