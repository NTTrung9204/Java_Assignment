
public class Bai_1 {
	public static double maxOfThree(double a, double b, double c) {
		if(a >= b && b >= c) return a;
		if(a >= c && c >= b) return a;
		if(b >= a && a >= c) return b;
		if(b >= c && c >= a) return b;
		if(c >= a && a >= b) return c;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(maxOfThree(4, 7, 2));
	}

}
