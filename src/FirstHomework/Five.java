package FirstHomework;
//複利計算公式：本利和 = 本金 × (1 + 年利率)^期間
//A = P (1 + r/n)^(nt)
//其中A為最終的本利和，P為本金，r為年利率，n為計息次數，t為投資年限。
public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double P = 1500000;
		double r = 0.2;
		int n = 1;
		int t = 10;
		double A = 0;
		A = P*Math.pow(1+r/n, n*t);
		System.out.println("本利和:" + A);
		
	}

}
