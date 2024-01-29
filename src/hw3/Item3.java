package hw3;

import java.util.Scanner;

public class Item3 {

	public static void main(String[] args) {
//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數
//		int Awenmath;
//		int count;
//		Scanner Sc = new Scanner(System.in);
//		System.out.println("阿文...請輸入你討厭哪個數字?");
//		Awenmath = Sc.nextInt();
//		count = 0;
//
//		for (int math = 1; math <= 49; math++) {
//
//			if (math / 10 == Awenmath || math % 10 == Awenmath) {
//				continue;
//			}
//			System.out.println(math + " ");
//			count++;
//		}
//		System.out.println("總共有" + count + "個數字可選");
//		

		// ==================進階題目====================//

		int Awenmath;
		int number[] = new int[6];
		Scanner Sc = new Scanner(System.in);

		// 請使用者輸入特定數字
		System.out.println("阿文...請輸入你討厭哪個數字?");
		Awenmath = Sc.nextInt();

		// 生成6個亂數，避免重複和特定數字
		for (int math1 = 0; math1 < number.length; math1++) {
			number[math1] = (int) (Math.random() * 49) + 1;

			// 檢查是否與之前的數字重複或與特定數字相同
			for (int math2 = 0; math2 < math1; math2++) {
				if (number[math1] == number[math2] || number[math1] == Awenmath) {
					math1--;// 若重複，減少 math1 的值，重新生成新數字

				}

			}

			// 檢查生成的數字是否包含特定數字的十位數或個位數
			if (number[math1] / 10 == Awenmath || number[math1] % 10 == Awenmath) {
				math1--;// 若重複，減少 math1 的值，重新生成新數字
				continue;

			}
		}
		// 印出生成的6個亂數
		for (int math1 = 0; math1 < 6; math1++) {
			System.out.print(number[math1] + " ");
		}

	}

}
