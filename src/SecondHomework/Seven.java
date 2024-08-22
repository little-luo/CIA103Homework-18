package SecondHomework;
//請設計一隻Java程式，輸出結果為以下：
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
public class Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		int start = 1; 
		int end = 1;
		
		while(Character.compare(c,'A') >= 0 &&  Character.compare(c,'F') <= 0) {
			start = 1;
			while(start <= end) {
				System.out.print(c + " ");
				start = start + 1;
			}
			System.out.println("");
			end = end + 1;
			c = (char) (c + 1);
		}
	}

}
