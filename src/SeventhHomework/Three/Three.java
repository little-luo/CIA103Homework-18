package SeventhHomework.Three;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

//請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//代表的檔案會複製到第二個參數代表的檔案
public class Three {
	
	public static void copyFile(File f1,File f2) throws IOException {
		Reader r = new FileReader(f1);
		Writer w = new FileWriter(f2);
		BufferedReader br = new BufferedReader(r);
		BufferedWriter bw = new BufferedWriter(w);
		String str;
		while((str = br.readLine())!= null) {
			bw.write(str + "\n");
		}
		br.close();
		bw.close();
		r.close();
		w.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("./src/SeventhHomeWork/Three/file1.txt");
		File f2 = new File("./src/SeventhHomeWork/Three/file2.txt");
		try {
			if(f1.exists()) {
				System.out.println("f1已存在");
			}else {
				f1.createNewFile();				
			}
			if(f2.exists()) {		
				System.out.println("f2已存在");
			}else {
				f2.createNewFile();				
			}
			copyFile(f1, f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
