package hw7;

// 抽象方法，需要由子類別實現
public abstract class Pen {
	private String brand;
	private double price;

	// 抽象方法，需要由子類別實現
	public abstract void write();

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
