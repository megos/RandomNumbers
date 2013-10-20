package rand.type;

public class MultiplicativeCongruenceMethod {
	int x = 15;
	/**
	 * 乱数を作る
	 * 
	 * @param num
	 * @return
	 */
	public int makeRandomNumber(int num) {
		num = (int) ((x * num) % (Math.pow(10, 6) + 1));
		return num;
	}
	
	
	public static void main(String args[]) {
		MultiplicativeCongruenceMethod mcm = new MultiplicativeCongruenceMethod();
		int num = 1;
		System.out.println("Seed: " + num);
		for (int i = 0; i < 10; i++) {
			num = mcm.makeRandomNumber(num);
			System.out.println("0." + String.format("%06d", num));
		}
	}
}
