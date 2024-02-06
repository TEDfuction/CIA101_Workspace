package hw4;

import java.util.Scanner;

public class Item5 {

	public static void main(String[] args) {
		// 請設計一隻程式由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，它會顯示是該年的第幾天

		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入yyyy");
		int year = sc.nextInt();
		System.out.print("請輸入mm");
		int month = sc.nextInt();
		System.out.print("請輸入dd");
		int day = sc.nextInt();

		int yeardays = day; // 初始天數設為輸入的日期
		int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 檢查是否為閏年，如果是，將2月的天數改為29天
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			days[1] = 29;
		}

		// 檢查輸入的日期是否合法，day > days[month - 1]是檢查輸入的日期是否超過該月的天數
		if (month < 1 || month > 12 || day < 1 || day > 31 || day > days[month - 1]) {
			System.out.println("月份輸入錯誤請重新輸入");
		} else {
			// 計算輸入日期是該年的第幾天，如果不設month - 1那輸入1月時會對應到陣列的第二個位置
			for (int array = 0; array < month - 1; array++) {
				yeardays += days[array];
			}
			// 輸出計算結果
			System.out.println("輸入的日期是該年的第 " + yeardays + " 天。");
		}
		sc.close();
	}
}
