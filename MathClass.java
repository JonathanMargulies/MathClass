import java.lang.Math;
public class MathClass {
	public static void main(String [] args) {
		System.out.println(xToPowerOfn(2, 10));
		System.out.println(SumOfyAndz(5,5));
		System.out.println(SqrtPlusOthers(64,-4,3));
	}


	public static double xToPowerOfn(double x, double n) {
		return Math.pow(x, n);
	}
	public static int SumOfyAndz(int y, int z) {
		return y+z;
	}
	public static double SqrtPlusOthers(double x, double g, double f) {
		x = Math.sqrt(x);
		g = Math.abs(g);
		f = Math.pow(f, g);
		return x + g + f;
	}
}
