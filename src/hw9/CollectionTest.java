package hw9;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest {
//	• 請建立一個Collection物件並將以下資料加入：
//	Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//	Object物件、“Snoopy”、BigInteger(“1000”)
//	• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//	• 移除不是java.lang.Number相關的物件
//	• 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功

	public static void main(String[] args) {
		// 建立一個 ArrayList 來儲存 Object 類型的物件
		ArrayList<Object> arraylist = new ArrayList<Object>();
		arraylist.add(new Integer(20));
		arraylist.add(new Double(3.14));
		arraylist.add(new Long(21L));
		arraylist.add(new Short("100"));
		arraylist.add(new Double(5.1));
		arraylist.add("Kitty");
		arraylist.add(new Integer(100));
		arraylist.add(new Object());
		arraylist.add("Snoopy");
		arraylist.add(new BigInteger("1000"));

		// Iterator
		// 迭代器
		Iterator Iter = arraylist.iterator();
		// 使用迭代器印出元素
		while (Iter.hasNext())
			System.out.println(Iter.next());
		System.out.println("==================================");
		
		// 傳統for
		for (int ls = 0; ls < arraylist.size(); ls++) {
			Object obj = arraylist.get(ls);
			System.out.println(obj);
		}
		System.out.println("==================================");
		
		// foreach
		for (Object ls : arraylist) {
			System.out.println(ls);
		}
		System.out.println("==================================");
		
		// 移除不是java.lang.Number相關的物件
		// 使用迭代器搜尋 ArrayList，移除不是 Number 相關的物件
		Iterator<Object> removeIterator = arraylist.iterator();
		while (removeIterator.hasNext()) {
			Object obj1 = removeIterator.next();
			if (!(obj1 instanceof Number)) {
				removeIterator.remove();
			}
		}
		// 再次印出這個集合物件的所有元素
		System.out.println(arraylist);
	}

}
