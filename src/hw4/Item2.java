package hw4;

public class Item2 {

	public static void main(String[] args) {
//		請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
//		(提示:String方法,陣列)
		String s = "Hello World";
		StringBuffer se = new StringBuffer(s);// 反轉
		System.out.print(se.reverse());

	}

}
