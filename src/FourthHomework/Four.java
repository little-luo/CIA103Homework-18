package FourthHomework;

import java.util.Scanner;

//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//表如下：
//員工編號	25		32		8		19		27
//身上現金	2500	800		500		1000	1200
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//員工編號: 25 19 27 共 3 人!」
public class Four {

	public static void main(String[] args) {
		int money = 0;
		int[][] employees = {{25,32,8,19,27},
							 {2500,800,500,1000,1200}};
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入欲借的金額:");
		if(sc.hasNext()) {
			money = sc.nextInt();
		}
		for(int i = 0; i < employees[1].length; i++) {
			if(employees[1][i] >= money) {
				count = count + 1;
				System.out.print(employees[0][i] + " ");
			}
		}
		System.out.println("共" + count + "人!");
	}

}
