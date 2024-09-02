package FivethHomework;

public class Pencil extends Pen {
	public Pencil(String brand, double penPrice){
		this.brand = brand;
		this.price = penPrice * 0.8;
	}
	
	public void write() {
		System.out.println("削鉛筆在寫!");
	}
}
