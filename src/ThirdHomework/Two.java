package ThirdHomework;

import java.util.Scanner;

//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//對則顯示正確訊息，如圖示結果
public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = (int)(Math.random()*10);
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!");
		while(true) {
			num = sc.nextInt();
			if(num == r) {
				System.out.println("答對了!答案就是" + r);
				break;
			}else {
				System.out.println("猜錯囉");
			}
		}
	}

}
