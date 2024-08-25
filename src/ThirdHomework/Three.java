package ThirdHomework;

import java.util.Scanner;

//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數，如圖：
public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int count = 0;
		int numArr[] = new int[49];
		int delNum = 0;
		System.out.println("阿文...請輸入您討厭哪個的數字?");
		if(sc.hasNext()) {
			num = sc.nextInt();
		}
		Outer:
		for(int i = 1; i <= 49; i++) {					
			if(i/10==num || i%10==num) {
				continue Outer;
			}else {
				count = count + 1;
				numArr[count] = i;
				if(count%6!=0)
				{
					System.out.print(i + "\t");
				}else {
					System.out.println(i + "");
				}
			}
		}
		System.out.println("總共:" + count +"數字可選");
		System.out.println("請輸入不要的數字:");
		if(sc.hasNext()) {
			delNum = sc.nextInt();
		}
		System.out.println("亂數產生6個號碼:");
		for(int i = 0; i < 6; i++) {
			int randNum = (int)(Math.random()*count);
			System.out.print(numArr[randNum] + "\t");
		}
		System.out.print('\n');
	}

}
