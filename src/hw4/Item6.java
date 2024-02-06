package hw4;

//import java.util.Arrays;

public class Item6 {

	public static void main(String[] args) {
		int[][] grades = { { 10, 35, 40, 100, 90, 85, 75, 70 }, 
				           { 37, 75, 77, 89, 64, 75, 70, 95 },
				           { 100, 70, 79, 90, 75, 70, 79, 90 }, 
				           { 77, 95, 70, 89, 60, 75, 85, 89 },
				           { 98, 70, 89, 90, 75, 90, 89, 90 }, 
				           { 90, 80, 100, 75, 50, 20, 99, 75 } };
		
		int count[] = new int[8];// 存放每位同學的最高分次數的陣列
		int students = 0;// 存放獲得最高分的同學的編號
		// 搜尋每位同學的成績
		for (int array1 = 0; array1 < grades.length; array1++) {
			int maxgrades = 0;// 初始化每位同學的最高分為0
			// 找出每位同學的最高分以及獲得最高分的考試編號
			for (int array2 = 0; array2 < grades[array1].length; array2++) {
				// 如果grades[array1][array2]比maxgrades還要大則更新maxgrades 
				if (grades[array1][array2] > maxgrades) {
					maxgrades = grades[array1][array2];// 更新最高分
					students = array2;// 更新獲得最高分的同學編號
				}

			}
			count[students]++;// 將獲得最高分的同學的最高分次數加1
		}
		for (int i = 0; i < count.length; i++) {
			System.out.println((i + 1) + "號" + count[i]);
		}
	}
}
