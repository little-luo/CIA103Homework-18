package SecondHomework;
//請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0;i <= 1000;i++) {
			if(i%2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
