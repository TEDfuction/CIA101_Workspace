package hw3;

import java.util.Scanner;

public class Item2 {

	public static void main(String[] args) {
//		請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//		對則顯示正確訊息
		int Random;
		Random = (int) (Math.random() * 10);
		Scanner Sc = new Scanner(System.in);
		System.out.println("開始猜數字吧");

		while (true) {
			int Mymath = Sc.nextInt();

			if (Mymath == Random) {
				System.out.println("恭喜你猜對了答案就是" + Mymath);
				break;  // 猜對了，結束迴圈
		
			} else if (Mymath < 0 || Mymath > 9) {
				System.out.println("輸入錯誤");
		
			} else {
				System.out.println("答錯瞜");
			}
		}
		Sc.close();
		
		// ==================進階題目====================//
//		int Random;
//		Random = (int) (Math.random() * 100);
//		Scanner Sc = new Scanner(System.in);
//		System.out.println("開始猜數字吧");
//
//		while (true) {
//			int Mymath = Sc.nextInt();
//			if (Mymath == Random) {
//				System.out.println("恭喜你猜對了答案就是" + Mymath);
//				break; // 猜對了，結束迴圈
//				
//			} else if (Mymath > Random) {
//				System.out.println("大於正確答案");
//				
//			} else if (Mymath < Random) {
//				System.out.println("小於正確答案");
//				
//			} else if (Mymath < 0 || Mymath > 100) {
//				System.out.println("輸入錯誤");
//				
//			} else {
//				System.out.println("答錯瞜");
//			}
//		}
//		Sc.close();
	}
}
