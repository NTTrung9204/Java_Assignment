
public class Bai_10 {
	public static long factorial(int n) {
		if(n == 1) return 1;
		return n*factorial(n-1);
	}
	
	public static double assign_10(int n) {
		return (n == 1)? 1 : 1.0/factorial(2*n-1) + assign_10(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(assign_10(5));
	}

}
