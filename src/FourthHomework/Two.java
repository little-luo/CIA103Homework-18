package FourthHomework;
//請建立一個字串，經過程式執行後，輸入結果是反過來的
//例如String s = “Hello World”，執行結果即為dlroW olleH
//(提示：String方法，陣列)
public class Two {

	public static void main(String[] args) {
		String s = "Hello World";
		int len = s.length();
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(len-1));
			len = len - 1;
		}
	}

}
