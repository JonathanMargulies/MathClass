public class MathNoClass {
	public static void main(String [] args) {
		System.out.println(xToPower10(2));
		System.out.println(SumOfwAndz(3,8));
		System.out.println(SqrtPlusOthers(64, -4, 2));	
	}

	public static int xToPower10 (int x) {
		return x*x*x*x*x*x*x*x*x*x;
	}
	public static int SumOfwAndz(int w, int z) {
		return w+z;
	}
	public static int SqrtPlusOthers(int num, int k, int l) {
		if(k >= 0) {
		System.out.println(k);
		} else {
		k = -1*k;
		}
		int a;
		int squareRoot = num/2;
		do {
			a = squareRoot;
			squareRoot = (a + (num/a))/2;
		} while ((a - squareRoot ) != 0);
		return squareRoot+k+(l*l*l*l);	
		
	}
}
