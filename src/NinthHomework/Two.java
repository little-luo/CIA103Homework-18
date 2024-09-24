package NinthHomework;

//• 熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領
//錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
//3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元
//以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
//大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢
//已經入帳戶。假設媽媽一次匯款 2000 元,熊大一次提款
//1000元,寫一個Java程式模擬匯款10次與提款10次的情
//形。
//• 參考範例：TestWaitNotify.java

class Account {
	private static int balance;
	private static int d_count = 0;
	private static int w_count = 0;
	public Account() {
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int money) {
		if(balance >= 3000) {
			try {
				System.out.println("媽媽看到餘額在3000以上，暫停匯款");
				if(w_count < 10) {					
					wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else {
			balance = balance + money;
			System.out.println("媽媽存了2000，帳戶共有" + balance);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify();
		d_count++;
	}

	public void withdraw(int money){
		if (balance >= money) {				
			balance = balance - money;
			System.out.println("熊大領了1000，帳戶共有" + balance);
			if(balance <= 2000) {					
				System.out.println("熊大看到餘額在2000元以下，要求匯款。");
			}
		}else {			
			try {
				System.out.println("熊大看到帳戶沒錢，暫停提款");
				if(d_count < 10) {					
					wait();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify();
		w_count++;
	}
}
class Mom extends Thread {
	Account account;
	
	public Mom(Account account) {
		this.account = account;
	}

	public void deposit(int money) {
		account.deposit(money);
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (account) {
				deposit(2000);
			}
		}
		System.out.println("媽媽結束");
	}
}

class Son extends Thread {
	Account account;

	public Son(Account account) {
		this.account = account;
	}

	public void withdraw(int money) {
		account.withdraw(money);

	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (account) {
				withdraw(1000);
			}
		}
		System.out.println("熊大結束");
	}
}


public class Two {
	public static void main(String[] args) {
		Account acc = new Account();
		
		Thread mom = new Mom(acc);
		Thread son = new Son(acc);

		mom.start();
		son.start();
		
	}
}
