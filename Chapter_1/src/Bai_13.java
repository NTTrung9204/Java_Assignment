
public class Bai_13 {
	public static long assign_13_GCD(int a, int b) {
		if(b == 0) return a;
		return assign_13_GCD(b, a % b);
	}
	
	public static long assign_13_LCM(int a, int b) {
		return a*b / assign_13_GCD(a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(assign_13_GCD(20, 60));
		System.out.print(assign_13_LCM(20, 60));
	}

}
