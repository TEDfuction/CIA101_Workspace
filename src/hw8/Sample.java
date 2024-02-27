package hw8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Sample {
//	請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//	Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Sample\\Sample.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		int byteCount = 0; 
		int charCount = 0;
		int lineCount = 0;
		String string;
		// 逐行讀取檔案內容
		while ((string = br.readLine()) != null) {
			System.out.println(string);// 輸出每一行的內容
			//byteCount += string.getBytes().length;// 更新位元組數計算每一行字串的位元組長度，但不包括換行符號
			byteCount = (int) file.length(); // 使用檔案大小作為位元組數;
			charCount += string.length();// 更新字元數
			charCount++; // 加上換行符號的長度
			lineCount++; // 更新列數
		}
		br.close();
		System.out.println("Sample.txt檔案共有 " + byteCount + " 個位元組, " + charCount + " 個字元, " + lineCount + " 列資料");

	}
}
