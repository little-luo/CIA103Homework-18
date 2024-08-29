package FourthHomework;
//班上有8位同學，他們進行了6次考試結果如下：
//請算出每位同學考最高分的次數
//(提示：二維陣列)
public class Six {

	public static void main(String[] args) {
		int[][] scores = {{10,35,40,100,90,85,75,70},
						  {37,75,77,89,64,75,70,95},
						  {100,70,79,90,75,70,79,90},
						  {77,95,70,89,60,75,85,89},
						  {98,70,89,90,75,90,89,90},
						  {90,80,100,75,50,20,99,75}};
		int[] count = new int[scores[0].length];
		for(int i = 0; i < scores.length; i++) {
			int max = 0;
//			紀錄每次考試最高分的位置
			int indexMax = 0;
//			預設最大值為每次考試成績中的第一筆資料
			max = scores[0][indexMax];
			for(int j = 0; j < scores[i].length; j++) {
				if(max > scores[i][j]) {
					continue;
				}else {
					max = scores[i][j];
					indexMax=j;
				}
			}
//			記錄每位同學考最高分的次數
			count[indexMax] = count[indexMax] + 1;
			
		}
		System.out.println("每位同學考最高分的次數");
		System.out.println("==========================");
		for(int i = 0;i < count.length; i++) {
			System.out.print(i+1 + "號" + '\t' + count[i] + "次");
			System.out.println("");
		}
	}

}
