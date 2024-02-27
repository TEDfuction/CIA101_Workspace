package hw8;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Datatxt {
//請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (請使用
//append功能讓每次執行結果都能被保存起來)
	public static void main(String[] args) throws IOException {
		// 創建檔案輸出流，並設置模式（true）
		FileOutputStream fos = new FileOutputStream("C:\\Sample\\Data.txt", true);
		// 創建緩衝輸出流
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// 使用 PrintStream 包裝輸出流
		PrintStream ps = new PrintStream(bos);
		// 創建一個整數列表
		List<Integer> list = new ArrayList<>();
		// 生成 10 個隨機整數並添加到列表中
		while (list.size() < 10) {
			list.add((int) (Math.random() * 1000) + 1);
		}
		// 將列表中的每個整數寫入到檔案中，使用空格分隔
		for (Integer num : list) {
			ps.print(num + " ");
		}
		//從最後開始關閉
		ps.close();
		bos.close();
		fos.close();

	}

}
