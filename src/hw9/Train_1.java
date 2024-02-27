package hw9;

import java.util.HashSet;
import java.util.Iterator;

public class Train_1 {

	public static void main(String[] args) {
		//HashSet
		//建立Train物件並放到集合中
		HashSet<Train> Train1 = new HashSet<Train>();
		Train1.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		Train1.add(new Train(1254, "區間", "屏東", "基隆", 700));
		Train1.add(new Train(118, "自強", "高雄", "台北", 500));
		Train1.add(new Train(1288, "區間", "新竹", "基隆", 400));
		Train1.add(new Train(122, "自強", "台中", "花蓮", 600));
		Train1.add(new Train(1222, "區間", "樹林", "七堵", 300));
		Train1.add(new Train(1254, "區間", "屏東", "基隆", 700));
		// 使用迭代器搜尋HashSet中的元素
		Iterator<Train> objs = Train1.iterator();
		while (objs.hasNext()) {
			Train train = objs.next();
			System.out.println(train);
		}
		System.out.println("=============================================");
		
		// 使用foreach搜尋HashSet中的元素
		for (Train train : Train1) {
			System.out.println(train);
		}
		System.out.println("=============================================");
		
		// 將HashSet轉換為陣列
		Object train[] = Train1.toArray();
		 // 使用for搜尋陣列中的元素
		for (int array = 0 ; array < train.length ; array++) {
			System.out.println(train[array]);
		}
		System.out.println("=============================================");
	}

}
