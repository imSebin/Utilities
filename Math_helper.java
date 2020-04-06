import java.math.BigInteger;

public class Math_helper {
	public static void main(String[] args) {
		cubica(-4, 3, 25, 6);
	}
	
	public static double add(double num1, double num2) {
		double num3 = num1 + num2;
		return num3;
	}
	
	public static double subt(double num1, double num2) {
		double num3 = num1 - num2;
		return num3;
	}
	
	public static double mult(double num1, double num2) {
		double num3 = num1 * num2;
		return num3;
	}
	
	public static double div(double num1, double num2) {
		double num3 = num1 / num2;
		return num3;
	}
	
	public static double squr(double num1, double num2) {
		double num3 = Math.pow(num1, num2);
		return num3;
	}
	
	public static double sqrt(double num1) {
		double num2 = Math.sqrt(num1);
		return num2;
	}
	
	public static double cbrt(double num1) {
		double num2 = Math.cbrt(num1);
		return num2;
	}
	
	public static double log(double num1) {
		double num2 = Math.log10(num1);
		return num2;
	}
	public static double logbp(double num1, double num2) {
		double num3 = (Math.log10(num2))/(Math.log10(num1));
		return num3;
	}
	
	public static double ln(double num1) {
		double num2 = Math.log(num1);
		return num2;
	}
	
	public static BigInteger fact(int num1) {
		BigInteger num3 = BigInteger.ONE;
	    for (int i = 2; i <= num1; i++)
	        num3 = num3.multiply(BigInteger.valueOf(i));
	    return num3;
	}
	
	public static double disc(double a, double b, double c) {
		double num = squr(b, 2) - (4 * a * c);
		return num;
	}
	
	public static double quad1(double a, double b, double c) {
		double num = ((- b) + sqrt(disc(a, b, c))) / (2 * a);
		return num;
	}
	
	public static double quad2(double a, double b, double c) {
		double num = ((- b) - sqrt(disc(a, b, c))) / (2 * a);
		return num;
	}
	
	public static void quada(double a, double b, double c) {
		double nump = ((- b) + sqrt(disc(a, b, c))) / (2 * a);
		double numn = ((- b) - sqrt(disc(a, b, c))) / (2 * a);

		System.out.println("x = " +nump +", or " +numn);
	}
	
	public static double cubica(double a, double b, double c, double d) {
		double p = (- b) / (3 * a);
		double q = squr(p, 3) + (((b * c) - (3 * a* d)) / (6 * squr(a, 2)));
		double r = c / (3 * a);
		
		System.out.println(p);
		System.out.println((r - squr(p, 2)));
		
		double num1 = cbrt(q + sqrt(squr(q, 2) + squr((r - squr(p, 2)), 3)));
		double num2 = cbrt(q - sqrt(squr(q, 2) + squr((r - squr(p, 2)), 3)));
		double num3 = num1 + num2 + p;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		return num3;
	}
	
	public static double e(double num1) {
		double num2 = Math.exp(num1);
		return num2;
	}
	
	public static int p(int num1, int num2) {
		int num3 = 1;
		return num3;
	}
	
	public static int c(int num1, int num2) {
		int num3 = 1;
		return num3;
	}
}
