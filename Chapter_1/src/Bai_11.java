
public class Bai_11 {
	public static long factorial(int n) {
		if(n == 1) return 1;
		return n*factorial(n-1);
	}
	
	public static long assign_11(int n) {
		if(n == 0 || n == 1) return 1;
		return n*assign_11(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(assign_11(7));
	}

}
