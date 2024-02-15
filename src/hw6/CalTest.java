package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator Cc = new Calculator();
		try {
			System.out.println("請輸入x ");
			int x = sc.nextInt();
			System.out.println("請輸入y ");
			int y = sc.nextInt();
			System.out.println(Cc.powerXY(x, y));
		// 自定義的 CalException 異常
		} catch (CalException e) {
			e.printStackTrace();// 打印異常訊息
		// 輸入格式不正確的異常	
		} catch (InputMismatchException e) {
			System.out.println("輸入不正確");// 提示用戶輸入格式不正確
		// 無論是否發生異常，都要確保關閉 Scanner
		} finally {
			sc.close();
		}

	}

}
