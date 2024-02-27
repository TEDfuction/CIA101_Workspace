package hw9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class Train_2 {

	public static void main(String[] args) {
		//ArrayList
		//建立Train物件並放到集合中
		ArrayList<Train> Train2 = new ArrayList<Train>();
		Train2.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		Train2.add(new Train(1254, "區間", "屏東", "基隆", 700));
		Train2.add(new Train(118, "自強", "高雄", "台北", 500));
		Train2.add(new Train(1288, "區間", "新竹", "基隆", 400));
		Train2.add(new Train(122, "自強", "台中", "花蓮", 600));
		Train2.add(new Train(1222, "區間", "樹林", "七堵", 300));
		Train2.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		// 使用Collections.sort()進行排序
		Collections.sort(Train2);
		// 使用迭代器搜尋ArrayList中的元素
		Iterator<Train> objs = Train2.iterator();
		while(objs.hasNext()) {
			Train train = objs.next();
			System.out.println(train);
		}
		System.out.println("=============================================");
		
		// 使用foreach搜尋ArrayList中的元素
		for(Train train : Train2) {
			System.out.println(train);
		}
		System.out.println("=============================================");

		// 將ArrayList轉換為陣列
		Object train[] = Train2.toArray();
		// 使用for搜尋陣列中的元素
		for (int array = 0 ; array < train.length ; array++) {
			System.out.println(train[array]);
		}
		System.out.println("=============================================");
	}

	

}
