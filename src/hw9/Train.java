package hw9;

import java.util.Objects;

public class Train implements Comparable<Train> {

//	• 請設計一個Train類別，並包含以下屬性：
//	- 班次 number，型別為int - 車種 type，型別為String - 出發地 start，型別為String
//	- 目的地 dest，型別為String - 票價 price，型別為double
//	• 設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題
//	需使用的集合裡
//	- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//	- (1254, “區間”, “屏東”, “基隆”, 700)
//	- (118, “自強”, “高雄”, “台北”, 500)
//	- (1288, “區間”, “新竹”, “基隆”, 400)
//	- (122, “自強”, “台中”, “花蓮”, 600)
//	- (1222, “區間”, “樹林”, 七堵, 300)
//	- (1254, “區間”, “屏東”, “基隆”, 700
	private int Number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public Train() {
		super();
	}
	
	public Train(int Number, String type, String start, String dest, double price ) {
		super();
		this.Number = Number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// 覆寫hashCode()根據物件的 Number、dest、price、start 和 type 生成 hash code
	@Override
	public int hashCode() {
		return Objects.hash(Number, dest, price, start, type);
	}

	// 覆寫equals()比較兩個火車物件是否相等
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Number == other.Number && Objects.equals(dest, other.dest)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	// 覆寫toString()將火車物件轉換為字串表示
	@Override
	public String toString() {
		return "Train [Number=" + Number + ", type=" + type + ", start=" + start + ", dest=" + dest + ", price=" + price
				+ "]";
	}

	// 覆寫compareTo()用於比較火車物件的大小
	@Override
	// 比較火車編號的大小
	public int compareTo(Train otherNumber) {
		return Integer.compare(otherNumber.Number, this.Number);
	}

}
