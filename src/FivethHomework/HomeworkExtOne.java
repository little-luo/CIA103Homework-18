package FivethHomework;

public class HomeworkExtOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen[] pens = new Pen[2];
		pens[0] = new Pencil("Brand1",30);
		pens[1] = new InkBrush("Brand2", 50);
		
		for(int i = 0; i < pens.length; i++) {
			pens[i].write();
			System.out.println("售價:" + pens[i].getPrice());
		}
		
//		Pencil pencil = new Pencil("Brand1",30);
//		System.out.println("Pencil Price:" + pencil.getPrice());
//		
//		InkBrush inkBrush = new InkBrush("Brand2", 50);
//		System.out.println("InkBrush Price:" + inkBrush.getPrice());
	}

}
