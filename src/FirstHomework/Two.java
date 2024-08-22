package FirstHomework;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eggNumber=200;
		int dozen=12;
		int box;
		
		box = eggNumber/dozen;
		
		System.out.println("雞蛋數量:"+eggNumber+"顆");
		System.out.println("一打雞蛋:"+dozen+"顆");
		System.out.println(eggNumber+"顆雞蛋"+","+"共是"+box+"打雞蛋"+","+box*dozen+"顆雞蛋");
	}

}
