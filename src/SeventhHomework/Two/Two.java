package SeventhHomework.Two;
//• 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt
//append功能讓每次執行結果都能被保存起來)


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Two {
	public static Set<Integer> getRandomNumber(){
		Set<Integer> set = new HashSet<Integer>();
		while(set.size() < 6) {
			int r = (int)(Math.random()*1000) + 1;
			set.add(r);
		}
		return set;
	}
	public static void main(String[] args) {
		Set<Integer> set = getRandomNumber();
		
		try {
			Writer os = new FileWriter("./src/SeventhHomework/Two/Data.txt",true);
			Iterator<Integer> it = set.iterator();
			while(it.hasNext()) {
				String str = it.next().toString();
				os.write(str + "\n");
			}
			os.write("==================" + "\n");
			os.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
