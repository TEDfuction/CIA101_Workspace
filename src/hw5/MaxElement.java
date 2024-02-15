package hw5;

public class MaxElement {

	public static void main(String[] args) {
		// 定義整數型二維陣列
		int intArray[][] = { { 1, 6, 3 }, { 9, 5, 2 } };
		// 定義浮點型二維陣列
		double doubleArray[][] = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		// 建立 MaxElement 物件
		MaxElement Max = new MaxElement();
		// 呼叫 maxElement 方法並印出結果
		System.out.println(Max.maxElement(intArray));
		System.out.println(Max.maxElement(doubleArray));

	}

	// 找出整數二維陣列的最大值
	public int maxElement(int intx[][]) {
		int intMax = 0;
		// 搜尋整數型二維陣列
		for (int array1 = 0; array1 < intx.length; array1++) {
			for (int array2 = 0; array2 < intx[array1].length; array2++) {
				// 如果元素大於目前最大值，則更新最大值
				if (intx[array1][array2] > intMax) {
					intMax = intx[array1][array2];
				}
			}

		}
		return intMax;// 回傳最大值
	}

	// 找出浮點型二維陣列的最大值
	public double maxElement(double doublex[][]) {
		double doubleMax = 0;
		// 搜尋浮點二維陣列
		for (int array3 = 0; array3 < doublex.length; array3++) {
			for (int array4 = 0; array4 < doublex[array3].length; array4++) {
				// 如果元素大於目前最大值，則更新最大值
				if (doublex[array3][array4] > doubleMax) {
					doubleMax = doublex[array3][array4];
				}
			}
		}
		return doubleMax;// 回傳最大值
	}
}
