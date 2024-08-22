package SecondHomework;
//請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		for(int i = 1;i < 10;i++) {
			int y = num;
			num = num * (i + 1);
			System.out.println(y + "*" + (i + 1) + "=" + num);
		}
	}
}
