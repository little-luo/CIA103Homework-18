package SeventhHomework.Five;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import SeventhHomework.Four.Animal;

//• 承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 (請利用多
//型簡化本題的程式設計)
public class Five {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File objFile = new File("C:\\data\\Object.ser");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		System.out.println("=====" + objFile.getName() + "=====");
		try {
			fis = new FileInputStream(objFile);
			ois = new ObjectInputStream(fis);
			while(true) {
				((Animal)ois.readObject()).speak();
			}
		} catch (EOFException e) {
			ois.close();
			fis.close();
			// TODO Auto-generated catch block
			System.out.println("檔案讀取完畢");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
