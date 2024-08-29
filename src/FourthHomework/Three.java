package FourthHomework;
//有個字串陣列如下 (八大行星)：
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
//(提示：字元比對，String方法)
// 答案: 18個
public class Three {

	public static void main(String[] args) {
		String[] strArr = {"mercury", 
							"venus", 
							"earth", 
							"mars", 
							"jupiter", 
							"saturn", 
							"uranus", 
							"neptune"};
		char[] vowel = {'a','e','i','o','u'};
		int count = 0;
		for(int i = 0; i < strArr.length; i++) {
			int len = strArr[i].length(); 
			for(int j = 0; j < len; j++) {
				for(int k = 0;k < vowel.length; k++) {
					if(strArr[i].charAt(j) == vowel[k]) {
						count = count + 1;
					}
				
				}
			}
		}
		System.out.println("count:" + count);
	}

}
