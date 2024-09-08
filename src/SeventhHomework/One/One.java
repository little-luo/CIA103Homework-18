package SeventhHomework.One;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料

public class One {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f1 = new File("./src/SeventhHomework/One/Sample.txt");
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			int countLine = 0;
			int countChar = 0;
			String string;
			while((string = br.readLine()) != null) {
//				計算列數
				countLine = countLine + 1;
//				計算字元數，字元數是Sample.txt中每一列的字串長度的總和
				countChar = countChar + string.length(); //536字元-10的換行字元等於526。
			}
			System.out.println("Sample.txt檔案共有"+f1.length()+"個位元組，"+countChar+"個字元，"+countLine+"列資料");
			
			br.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
