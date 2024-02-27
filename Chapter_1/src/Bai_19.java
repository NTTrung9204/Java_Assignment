
public class Bai_19 {
	public static void assign_19(int n) {
		long a = 1, b = 1, c;
		System.out.print(1 + " ");
		for(int i = 1; i < n; i++) {
			System.out.print(b + " ");
			c = b;
			b += a;
			a = c;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assign_19(8);
	}

}
