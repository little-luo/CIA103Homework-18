package SecondHomework;
//請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int num = 1;
		while(i < 10) {
			num = num * (i + 1);
			i++;
		}
		System.out.print(num);
	}

}
