package FivethHomework;

import java.util.function.BiConsumer;

//請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：
public class Two {
	public static void randAvg() {
		int[] randArr = new int[10];
		int sum = 0;
		int avg = 0;
		for(int i = 0; i < randArr.length; i++) {
			randArr[i] = (int)(Math.random()*101);
			sum = sum + randArr[i];
			System.out.print(randArr[i] + " ");
		}
		System.out.println("");
		System.out.println("sum:"+sum);
		avg = sum / randArr.length;
		System.out.println("Avg:"+avg);
	}
	public static void main(String[] args) {
		randAvg();
	}

}
