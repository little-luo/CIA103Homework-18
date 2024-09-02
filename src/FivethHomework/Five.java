package FivethHomework;
//• 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//與數字的亂數組合，如圖：
public class Five {
	public static char[] getAuthCode() {
		int num;
		char[] AuthCode = new char[8];
		int i = 0;
		int j = (int)(Math.random()*8);

		while(i < AuthCode.length) {			
			num = (int) (Math.ceil(Math.random()*74)+48);
			if(num >= 58 && num <= 64) {
				continue;
			}else if(num >= 91 && num <= 96 ) {
				continue;
			}else {					
				AuthCode[i] = (char)num;
				i++;
			}
		}
		AuthCode[j] = (char)(Math.random()*10+48);
		return AuthCode;
	}
	public static void main(String[] args) {
		char[] Autucode = getAuthCode();
		System.out.println("本次隨機產生驗證碼為:");
		for(int i = 0; i < Autucode.length; i++) {
			System.out.print(Autucode[i]);
		}
		 
	}

}
