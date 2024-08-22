package FirstHomework;
//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float pi=3.1415f;
		int r=5;
		double area,circumference;
		
		area = pi*Math.pow(r, 2);
		area = area*Math.pow(10, 2);
		area = Math.round(area)/Math.pow(10, 2); 
		circumference = 2*pi*r;
		circumference = circumference*Math.pow(10, 2);
		circumference = Math.round(circumference)/Math.pow(10, 2);
		
		System.out.println("Area:"+area);
		System.out.println("Cirum:"+circumference);
	}

}
