
public class Bai_9 {
	public static long factorial(int n) {
		if(n == 1) return 1;
		return n*factorial(n-1);
	}
	
	public static double _seriFactorial(int n) {
		if(n==1) return -1;
		if(n%2 == 0) {
			return (double)1/factorial(n) + _seriFactorial(n-1);
		}
		return -(double)1/factorial(n) + _seriFactorial(n-1);
	}
	
	public static double assign_9(int n) {
		return 15 + _seriFactorial(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(assign_9(6));
	}

}
