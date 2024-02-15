package hw5;

public class MyRectangleMain {

	public static void main(String[] args) {
		// 創立 MyRectangle 物件 RectangleMain1
		// 使用無參數建構子初始化，並設定寬度和深度，然後計算並輸出面積
		MyRectangle RectangleMain1 = new MyRectangle();
		RectangleMain1.setWidth(5);// 設定寬度
		RectangleMain1.setDepth(3);// 設定深度
		RectangleMain1.getArea();// 呼叫 getArea() 方法計算並輸出面積

		// 創建 MyRectangle 物件 RectangleMain2
		// 使用帶參數的建構子初始化，設定寬度和深度為5和3，然後計算並輸出面積
		MyRectangle RectangleMain2 = new MyRectangle(5, 3);
		RectangleMain2.getArea();
	}

}
