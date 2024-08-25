package ThirdHomework;

import java.util.Scanner;

//• 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形，如圖示結果：
//(提示：Scanner，三角形成立條件，判斷式if else)
//(進階功能：加入直角三角形的判斷)
/*
 * 正三角形:三邊等長
 * 等腰三角形:至少兩邊等長
 * 不是三角形:任一邊長度為0
 */
public class One {

	public static void main(String[] args) {
		int a = 0,b = 0,c = 0;
		System.out.println("請輸入三個整數:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a > 0 && b > 0 && c > 0) {
//			三邊等長
			if(a == b && b == c) {
				System.out.println("正三角形");
//				任兩邊等長
			}else if(a == b || a== c) {
				System.out.println("等腰三角形");
//				任意兩邊和必大於第三邊
			}else if(a + b > c && b + c > a && a + c > a) {
//				兩股平方和等於斜邊平方
				if((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a)) {
					System.out.println("直角三角形");
				}else {
					System.out.println("其他三角形");					
				}
			}
		}else{
//			任一邊長為0
			System.out.println("不是三角形");
		}	
	}

}
