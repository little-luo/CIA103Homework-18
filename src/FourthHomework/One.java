package FourthHomework;

import java.util.Arrays;

//有個一維陣列如下：
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示：陣列，length屬性)
public class One {

	public static int getAvg(int[] arr) {
		int sum = 0;
		int avg = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		System.out.println("平均值:" + avg);
		return avg;
	}
	
	public static void greaterThanAvg(int avg,int[] arr) {
		Arrays.sort(arr);
		System.out.print("大於平均值的元素:");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > avg) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {29,100,39,41,50,8,66,77,95,15};
		int avg = getAvg(arr);
		greaterThanAvg(avg, arr);
		
	}

}
