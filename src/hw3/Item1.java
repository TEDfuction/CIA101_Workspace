package hw3;

import java.util.Scanner;

public class Item1 {

	public static void main(String[] args) {
//		請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形
		int Side1, Side2, Side3;
		Scanner Sc = new Scanner(System.in);
		System.out.println("請輸入邊1");
		Side1 = Sc.nextInt();
		System.out.println("請輸入邊2");
		Side2 = Sc.nextInt();
		System.out.println("請輸入邊3");
		Side3 = Sc.nextInt();

		if (Side1 != 0 && Side2 != 0 && Side2 != 0) {

			if (Side1 == Side2 && Side2 == Side3 && Side1 == Side3) {
				System.out.println("正三角形");

			} else if (Side1 == Side2 || Side2 == Side3 || Side1 == Side3) {
				System.out.println("等腰三角形");

			} else if (Math.pow(Side1, 2) + Math.pow(Side2, 2) == Math.pow(Side3, 2)
					|| Math.pow(Side1, 2) + Math.pow(Side3, 2) == Math.pow(Side2, 2)
					|| Math.pow(Side2, 2) + Math.pow(Side3, 2) == Math.pow(Side1, 2)) {
				System.out.println("直角三角形"); // 加入直角三角形的判斷

			} else if (Side1 + Side2 > Side3 && Side2 + Side3 > Side1 && Side1 + Side3 > Side2) {
				System.out.println("其他三角形");

			} else {
				System.out.println("不是三角形");
			}

		} else {
			System.out.println("不是三角形");
		}
		Sc.close();
	}
}
