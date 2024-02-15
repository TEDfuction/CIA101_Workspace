package hw5;

public class RandomAverage {
//randAvg() 方法會生成一個包含10個隨機整數的數組，每個整數都是0到99之間的隨機數，然後計算這些隨機數的平均值。
	public static void main(String[] args) {
		// RandomAverage ra = new RandomAverage();
		// ra.randAvg();
		randAvg(); // 呼叫randAvg()方法，生成隨機數組並計算平均值
	}

	// 定義randAvg()方法，用於生成隨機數組並計算平均值
	public static void randAvg() {
		int avg = 0;// 平均值初始化為0
		int[] numbers = new int[10];// 產生包含10個元素的整數數組
		for (int math = 0; math < numbers.length; math++) {
			numbers[math] = (int) (Math.random() * 100);// 生成0到99之間的隨機整數
			avg += numbers[math];
			System.out.print(numbers[math] + " ");// 輸出每個隨機數
		}
		System.out.println(); // 換行
		System.out.println(avg / numbers.length);// 輸出平均值
	}
}
