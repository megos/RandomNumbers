package rand.type;

public class TauswortheMethod {
	int p = 3;
	int q = 1;
	static int num[] = new int[20];
	/**
	 * 乱数を作る
	 * 
	 * @param num
	 * @return
	 */
	public void makeRandomNumber(int[] num, int i) {
		num[i] = (num[i - p]) ^ (num[i - q]);
//		return num;
	}
	
	
	public static void main(String args[]) {
		TauswortheMethod tm = new TauswortheMethod();
//		String a;
		num[0] = 16;
		num[1] = 24;
		num[2] = 11;
		for (int i = 3; i < 14; i++) {
			tm.makeRandomNumber(num, i);
//			a = "";
//			for (int j = 0; j < 8; j++) {
//				a += Integer.toString(num[j]);
//			}
//			System.out.println(Integer.parseInt(a, 2));
			System.out.println(num[i]);
		}
	}
}
