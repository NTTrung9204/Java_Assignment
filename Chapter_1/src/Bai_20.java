
public class Bai_20 {
	public static int assign_20(long n) {
		long a = 1, b = 1, c;
		int index = 2;
		while(true) {
			if(b > n) return -1;
			if(b == n) return index;
			c = b;
			b += a;
			a = c;
			index++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(assign_20(9));
	}

}
