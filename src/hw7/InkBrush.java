package hw7;

public class InkBrush extends Pen {
	@Override
	public double getPrice() {
		return super.getPrice() * 0.9; // 以 90% 的價格返回原來的價格
	}
	@Override
	public void write() {
		System.out.print("沾墨汁再寫"); // 覆寫，輸出"沾墨汁再寫"
	}
}
