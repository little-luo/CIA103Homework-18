package SixthHomework;

public class Calculator {
	
	public Calculator() {}
	
	
	public double powerXY(int x,int y) throws CalException {
		if(x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義!");
		}else if(x > 0 && y < 0) {
			throw new CalException("次方為負值，結果回傳不為負值");
		}else{
			return Math.pow(x, y);
		}
		
	}

}
