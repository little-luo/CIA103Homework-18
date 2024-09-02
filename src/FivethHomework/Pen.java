package FivethHomework;

public abstract class Pen {
//  實體變數
	protected String brand;
	protected double price;
//	建構子
	public Pen() {
		
	}
	public Pen(String brand,double price) {
		this.brand = brand;
		this.price = price;
	}
//	getter/setter
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
//	抽象方法
	public abstract void write();
	
}
