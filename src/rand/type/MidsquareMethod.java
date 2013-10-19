package rand.type;

public class MidsquareMethod {
	
	
	/**
	 * 乱数を作る
	 * 
	 * @param num (0,1)
	 * @return
	 */
	public double makeRandomNumber(double num) {
		int k = 2;
		num = Math.pow(num, k);
		String numStr = Double.toString(num);
		numStr = "0." + numStr.substring(k + 2, 3 * k + 2);
		num = Double.parseDouble(numStr);
		return num;
	}
	
	
	public static void main(String args[]) {
		MidsquareMethod mm = new MidsquareMethod();
		double num = Math.random();
		String numStr = Double.toString(num);
		numStr = numStr.substring(0,6);
		System.out.println("Seed: " + numStr);
		num = Double.parseDouble(numStr);
		for (int i = 0; i < 10; i++) {
			num = mm.makeRandomNumber(num);
			System.out.println(num);
		}
	}
}
