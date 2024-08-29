//• 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//(提示1：Scanner，陣列)
//(提示2：需將閏年條件加入)
//(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
package FourthHomework;

import java.util.Scanner;

public class Five {
	
	static int year;
	static int month;
	static int day;
	
	public static void typeDate(int calendar[][]) {
		System.out.print("請輸入日期:");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext()) {
			year = sc.nextInt();
			month = sc.nextInt();
			day = sc.nextInt();
		}
		if(month > 12) {
			System.out.println("您輸入的月份是" + month + ",不得超過12");
		}else if(day > calendar[month-1][1]){	
			System.out.println("您輸入的月份是" + month + ",該日期不得超過" + calendar[month-1][1]);
		}else {
			System.out.format("您輸入的日期:%d年%d月%d日", year,month,day);
			System.out.println("");			
		}
	}
	public static boolean isLeap(int year) {
		boolean flag = false;
		if(year%4==0 && year%100!=0) {
			flag = true;
			return flag;
		}else if(year%4==0 && year%100==0 && year%400==0) {
			flag = true;
			return flag;
		}else {
			flag = false;
			return flag;
		}
		
	}
	public static int getDate(int[][] calendar) {
		int sum = 0;
		for(int i = 0; i < month-1; i++) {
			for(int j = 1; j < calendar[i].length; j++)
			sum = sum + calendar[i][j];
		}
		sum = sum + day;
		return sum;
	}
	public static int showDate(int[][] calendar) {
		int sum = 0;
		if(isLeap(year) && month <= 12 && day <= calendar[month-1][1]) {
			calendar[1][1] = 29;
			sum = getDate(calendar);
		}else if(month <= 12 && day <= calendar[month-1][1]) {
			calendar[1][1] = 28;
			sum = getDate(calendar);
		}else {
			System.out.println("您輸入的日期錯誤");			
		}
		return sum;
	}
	public static void main(String[] args) { 
		int sum = 0;
		int[][] calendar = {{1,31},
							{2,28},
							{3,31},
							{4,30},
							{5,31},
							{6,30},
							{7,31},
							{8,31},
							{9,30},
							{10,31},
							{11,30},
							{12,31}};
		typeDate(calendar);
		sum = showDate(calendar);
		System.out.println("輸入的日期為該年第" + sum + "天");

	}

}
