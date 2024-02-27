
public class Bai_8 {
	public static double assign_8(int n) {
		if(n == 1) return 1.0;
		return (double)1/n+assign_8(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(assign_8(11));
	}

}
