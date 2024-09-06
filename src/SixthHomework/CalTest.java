package SixthHomework;

import java.util.Scanner;

//請設計三個類別Calculator.java，CalException.java與CalTest.java，在Calculator.java裡有個自訂
//方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果。 CalTest.java執行後，使用者可
//以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：
//1. x與y同時為0，(產生自訂的CalException例外物件)
//2. y為負值，而導致x的y次方結果不為整數
//3. x與y皆正確情況下，會顯示運算後結果
public class CalTest {
	
	public static int getValue(char c) throws Exception {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入" + c + "的值");
		if(sc.hasNext()) {
			num = sc.nextInt();
		}
		return num;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0,y = 0;
		Calculator calculator = new Calculator();
		try {
			x = getValue('x');
			y = getValue('y');
			System.out.println(x + "的" + y +"次方等於:" + calculator.powerXY(x, y));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("你輸入的格式不正確");
		} 
	}

}
