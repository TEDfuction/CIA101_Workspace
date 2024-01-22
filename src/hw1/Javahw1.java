package hw1;

import org.w3c.dom.ls.LSOutput;

public class Javahw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		請設計一隻Java程式,計算12,6這兩個數值的和與積
//		請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
//		請由程式算出256559秒為多少天、多少小時、多少分與多少秒
//		請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
//		某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		金加利息共有多少錢 (用複利計算,公式請自行google)
//		請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		5 + 5
//		5 + ‘5’
//		5 + “5”

		// 1.
		int n1 = 12, n2 = 6, n3, n4;
		n3 = n1 + n2;
		n4 = n1 * n2;
		System.out.print("和" + n3 + "\n");
		System.out.print("積" + n4 + "\n");
		System.out.print("---------------------------------\n");

		// 2.
		int egg = 200, Beat = 12, grain, Remain;
		grain = egg / Beat;
		Remain = egg % Beat;
		System.out.print(grain + "打" + "餘" + Remain + "顆\n");
		System.out.print("---------------------------------\n");

		// 3.
		int titleSecond = 256559, day = 24, hour = 60, minute = 60, allday, allhour, allminute ,Second;
		allday = (titleSecond / minute / hour / day )%60;
		allhour = (titleSecond / minute / hour)%24;
		allminute = (titleSecond / minute)% 60;
		Second = titleSecond % 60;
		System.out.print(allday + "天" + allhour + "小時" + allminute + "分"+ Second + "秒\n");
		System.out.print("---------------------------------\n");

		// 4.
		int radius = 5;
		double circlearea, circumference;
		final double PI = 3.14;
		circlearea = radius * radius * PI;
		circumference = (radius + radius) * PI;
		System.out.print("圓面積" + circlearea + "圓周長" + circumference + "\n");
		System.out.print("---------------------------------\n");

		// 5.
		int money = 1500000;
		double rate = 1 + 0.02;
		for (int i = 0; i < 10; i++) {
			money *= rate;

		}
		System.out.println(money);
		System.out.print("---------------------------------\n");

		// 6.
		System.out.println(5 + 5);// 數字總和
		System.out.println(5 + '5');// ASCII
		System.out.println(5 + "5");// "5"是字串
	}

}
