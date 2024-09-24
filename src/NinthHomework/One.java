package NinthHomework;

//• 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//競賽過程。
//• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示
//• 參考範例：CounterRunnable.java
//• 需留意主執行緒執行順序
public class One extends Thread {

	public One(String name) {
		super(name);
	}

	public static boolean flag = false;

	public static void main(String[] args) {
	
		System.out.println("-----大胃王快食比賽開始-----");
		
		Thread thread1 = new One("饅頭人");
		Thread thread2 = new One("詹姆士");
	
		try {
//			啟動執行緒
			thread1.start();
			thread2.start();
//			比賽開始
			flag = true;
//			先執行執行緒後執行main執行緒
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("-----大胃王快食比賽結束-----");
	}

	public void run() {
		int i = 0;
//		延遲時間
		int delay = (int)(Math.random() * 3000) + 1;
//		執行緒等待開始
		while (!flag) {
		}

		while (i < 10) {
			System.out.println(this.getName() + "吃第" + (i + 1) + "碗飯");
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i = i + 1;
		}
		if (i == 10) {
			System.out.println(this.getName() + "吃完了!");
		}
	}

}
