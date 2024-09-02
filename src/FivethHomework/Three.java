package FivethHomework;
//利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//可以找出二維陣列的最大值並回傳，如圖
public class Three {
	public int maxElement(int intArr[][]) {
		int max = intArr[0][0];
		for(int i = 0; i < intArr.length; i++) {
			for(int j = 0; j < intArr[i].length; j++) {
				if(max > intArr[i][j]) {
					continue;
				}else {
					max = intArr[i][j];
				}
			}
		}
		return max;
	}
	public double maxElement(double doubleArr[][]) {
		double max = doubleArr[0][0];
		for(int i = 0; i < doubleArr.length; i++) {
			for(int j = 0; j < doubleArr[i].length; j++) {
				if(max > doubleArr[i][j]) {
					continue;
				}else {
					max = doubleArr[i][j];
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[][] intArr = {{1,6,3},
						  {9,5,2}};
		
		double[][] doubleArr = {{1.2,3.5,2.2},
								{7.4,2.1,8.2}};
		
		Three three = new Three();
		System.out.println(three.maxElement(intArr));
		System.out.println(three.maxElement(doubleArr));
	}

}
