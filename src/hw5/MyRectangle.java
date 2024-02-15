package hw5;

public class MyRectangle {
	private double width;
	private double depth;

	// 無參數建構子
	public MyRectangle() {
		super();// 調用父類別的建構子
	}

	public MyRectangle(double width, double depth) {
		//super();//（這裡沒有父類別，所以可以省略）
		this.width = width;
		this.depth = depth;
	}
	// 取得寬度
	public double getWidth() {
		return width;
	}
	// 設定寬度
	public void setWidth(double width) {
		this.width = width;
	}
	// 取得深度
	public double getDepth() {
		return depth;
	}
	// 設定深度
	public void setDepth(double depth) {
		this.depth = depth;
	}
	// 計算並輸出長方形的面積
	public void getArea() {
		System.out.println("長方形的面積為:" + width * depth);
	}

}
