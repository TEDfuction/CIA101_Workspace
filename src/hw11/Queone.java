package hw11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Queone {
	public List<Integer> random(int min, int max, int num) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= num; i++) {
			int r = (int) (Math.random() * (max - min)) + min;
			list.add(r);
		}
		Collections.sort(list);
		return list;
	}

	public void checkPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++)
			if (num % i == 0) {
				count++;
			}
		if (count == 2) {
			System.out.println(num + "是質數");
		} else {
			System.out.println(num + "不是質數");
		}
	}
}
