package hw4;

import java.util.Scanner;

public class Item4 {

	public static void main(String[] args) {
//		阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下：
//		員工編號:{ 25, 32, 8, 19, 27 }	身上現金:{ 2500, 800, 500, 1000, 1200 }
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!
		
		System.out.print("想借的金額");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		// worker[0]為員工編號，worker[1]為身上現金
		int worker[][] = { { 25, 32, 8, 19, 27 }, 
				           { 2500, 800, 500, 1000, 1200 } };
		int count = 0;
		//外迴圈陣列為工人的編號。
		for (int staff = 0; staff < worker.length; staff++) {
			//內迴圈用來搜尋當前工人的可借金額。
			for (int cash = 0; cash < worker[staff].length; cash++) {
				//staff==1的目的是確保迴圈正在worker陣列的第二行
				if (staff == 1 && worker[staff][cash] >= money) {
					//worker[0]是鎖定陣列員工編號，worker[cash]是從第二行去找對應員工的金額
					//因此來印出哪些是符合能借的有那些員工
					System.out.println("能借的有" + worker[0][cash] + "號員工");
					count++;//計算總共幾人
				}
			}

		}
		System.out.println("總共" + count + "人");
		sc.close();
	}
}