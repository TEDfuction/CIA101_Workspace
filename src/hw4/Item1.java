package hw4;

import java.util.Arrays;

public class Item1 {

	public static void main(String[] args) {
//		有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示:陣列,length屬性)
		int sum = 0;
		int average = 0;
		int array[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		Arrays.sort(array);// 陣列由小到大
		for (int math = 0; math < array.length; math++) {
			sum += array[math];// sum陣列數字加總
			average = sum / array.length;// 取得平均average

		}
		for (int math = 0; math < array.length; math++) {
			// array[math]數大於平均的印出
			if (array[math] > average) {
				System.out.println("大於平均數的陣列" + array[math]);
			}
		}

		System.out.println("平均數" + average);
	}

}
