package rand.type;

public class LinearCongruentialGenerators {
	int A = 3;
	int B = 5;
	int M = 100;
	
	/**
	 * 乱数を作る
	 * 
	 * @param num
	 * @return
	 */
	public int makeRandomNumber(int num) {
		num = (int)((A * num + B) % M);
		return num;
	}
	
	
	public static void main(String args[]) {
		LinearCongruentialGenerators lcgs = new LinearCongruentialGenerators();
		int num = (int)(Math.random() * 100);
		System.out.println("Seed: " + num);
		for (int i = 0; i < 10; i++) {
			num = lcgs.makeRandomNumber(num);
			System.out.println(num);
		}
	}
}
