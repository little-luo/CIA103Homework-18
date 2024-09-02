package FivethHomework;

public class MyRectangle {
	private double width;
	private double depth;
	
	public MyRectangle(double width,double depth) {
		this.width = width;
		this.depth = depth;
	}
	public MyRectangle() {
		this(10, 20);
	}
	
	
	
	public void setWidth(double width) {
		this.width = width;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	public double getArea() {
		return  width * depth;
	}

}
