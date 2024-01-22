package hw2;

public class Javahw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// --------- for + while ------------//
//		int i;
//		for (i = 1; i < 9; i++) {
//			int j=1;
//			while (j++ < 9) {
//				System.out.print(i + "*" + j + "=" + i*j + "\t");
//			}
//			System.out.println();
//		}

		// --------- for + do_while ------------//
//		int i;
//		for (i = 1; i < 9; i++) {
//			int j=1;
//			do {
//				j++;
//				
//				System.out.print(i + "*" + j + "=" + i*j + "\t");
//			}while(j < 9);
//			System.out.println();
//		}
		// --------- while + do_while ------------//
//		int i = 0;
//		while (i++ < 9) {
//			int j = 1;
//			do {
//				j++;
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//			} while (j < 9);
//			System.out.println();
//		}

		// ------------計算1~1000的偶數和--------------//
//		int i, sum = 0;
//		for (i = 1; i <= 1000; i++) {
//			if (i % 2 == 0) {
//				sum += i;
//			}
//		}
//		System.out.print(sum + " ");

		// ------------計算1~10的連乘積for----------------//
//		int i, j = 1;
//		for (i = 1; i <= 10; i++) {
//			j *= i;	
//		}
//		System.out.print(j + " ");
		// ------------計算1~10的連乘積while----------------//
//		int i = 1, j = 1;
//		while (i <= 10) {
//			j *= i;
//			i++;	
//		}
//		System.out.print(j + " ");

		// ------------輸出結果1 4 9 16 25 36 49 64 81 100-//
//		int i;
//		for (i = 1; i <= 10; i++) {
//			if (i * i <= 100) {
//				System.out.print(i * i + " ");
//			}
//		}

		// --------------大樂透1~49跳過4的位數---------------//
//		int i;
//		int k=0;
//		for (i = 1; i <= 49; i++) {
//			
//			if (i / 10 == 4 || i % 10 == 4){
//				continue;
//			}
//			k++;
//			System.out.print(i + " ");
//		}
//		   System.out.print("總共"+ k + " " );

		// ------------設計一隻Java程式,輸出結果為以下:12345678910 1234556789--//
//		for (int i = 10; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		// -----------請設計一隻Java程式,輸出結果為以下:A BB CCC DDD EEE
//		char k = 65;
//		for (int i = 1; i <= 6; i++) {
//			for (int j = 1; j <= i; j++) {
//				
//				System.out.print(k);
//			}
//			k++;
//			System.out.println();
//		}

	}

}
