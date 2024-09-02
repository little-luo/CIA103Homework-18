package FivethHomework;
//請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如
//圖
/*
請輸入寬與高:
5 4
*****
*****
*****
*****
 */
import java.util.Scanner;

public class One {
	
	private static int width;
	private static int height;
	
	public static void starSquare(int width, int height) {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	public static void getInput() {
		System.out.println("請輸入寬與高:");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext()) {
			width = sc.nextInt();
			height = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		getInput();
		starSquare(width, height);
	}

}
