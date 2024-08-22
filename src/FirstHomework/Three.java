package FirstHomework;
//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int second = 256559;
		int sec,min,hr,day;
		
		sec = second/(int)Math.pow(60, 0)%60;
		min = second/(int)Math.pow(60, 1)%60;
		hr = second/(int)Math.pow(60, 2)%24;
		day = second/(int)Math.pow(60, 2)/24;
		System.out.println(day+"天"+" "+hr+"時"+" "+min+"分"+" "+sec+"秒");
		
	}

}
