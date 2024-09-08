package SeventhHomework.Four;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

//• 請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List animal = new ArrayList();
		Cat cat1 = new Cat("cat1");
		Cat cat2 = new Cat("cat2");
		Dog dog1 = new Dog("dog1");
		Dog dog2 = new Dog("dog2");
		
		animal.add(dog1);
		animal.add(dog2);
		animal.add(cat1);
		animal.add(cat2);
//		輸出
		File myDir = new File("C:\\data");
		int i = 0;
		File myFile = null;
		try {
			if(myDir.exists()){
				System.out.println("目錄已存在");
			}else {
				myDir.mkdir();
			}
			myFile = new File(myDir,"Object.ser");
			FileOutputStream fos = new FileOutputStream(myFile);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			while(i < animal.size()) {
				oos.writeObject(animal.get(i));
				i++;
			}
			oos.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
