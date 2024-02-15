package hw7;

public class Pencil extends Pen {
	@Override
	public double getPrice() {
		return super.getPrice() * 0.8;
	}

	@Override
	public void write() {
		System.out.println("削鉛筆再寫");// 覆寫，輸出 "削鉛筆再寫"
	}
}
