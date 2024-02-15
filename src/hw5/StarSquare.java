package hw5;

import java.util.Scanner;

public class StarSquare {
//starSquare從main函數中調用 starSquare(int x int y) 來印出這個預設大小的正方形。
	public static void main(String[] args) {
//		請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
//		圖:
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬與高");
		//StarSquare ss = new StarSquare();
		int height = sc.nextInt();
		int width = sc.nextInt();
		// 用starSquare方法傳遞用戶輸入的寬度和高度作為參數
		//ss.starSquare(width, height);
		starSquare(width, height);
		// 關閉Scanner物件釋放資源
		sc.close();

	}

	// 定義名為starSquare的方法，印出指定寬度和高度的星號
	public static void starSquare(int width, int height) {
		// 檢查寬度和高度是否都大於0
		if (width > 0 && height > 0) {
			// 外層迴圈用於控制行數，從0到width-1
			for (int math1 = 0; math1 < width; math1++) {
				// 內層迴圈用於控制每行中的星號數量，從0到height-1
				for (int math2 = 0; math2 < height; math2++) {
					// 在每個位置上印出一個星號，並在星號後面加上空格
					System.out.print("* ");
				}
				// 每行結束後換行
				System.out.println();
			}
		} else {
			System.out.println("寬或高輸入錯誤");
		}

	}

}
