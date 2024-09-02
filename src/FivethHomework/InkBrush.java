package FivethHomework;

public class InkBrush extends Pen {
	
	public InkBrush(String brand,double InkBrushPrice) {
		this.brand = brand;
		this.price = InkBrushPrice * 0.9;
	}
	
	public void write() {
		System.out.println("沾墨水在寫!");
	}
	

}
