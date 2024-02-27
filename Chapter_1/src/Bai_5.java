
public class Bai_5 {
	public static double medianNumber(double a, double b, double c) {
		if(a >= b && b >= c) return b;
		if(a >= c && c >= b) return c;
		if(b >= a && a >= c) return a;
		if(b >= c && c >= a) return c;
		if(c >= a && a >= b) return a;
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(medianNumber(3, 4, 5));
	}

}
