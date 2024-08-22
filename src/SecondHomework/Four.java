package SecondHomework;
//請設計一隻Java程式，輸出結果為以下：
//1 4 9 16 25 36 49 64 81 100
public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while((i*i) <= 100) {
			System.out.printf("%d ",i*i);
			i = i + 1;
		}
	}

}
