
public class Bai_17 {
	public static boolean assign_14(long m) {
		if(m < 2) return false;
		if(m < 4) return true;
		if(m % 2 == 0 || m % 3 == 0) return false;
		for(int i = 5; i*i <= m; i+=6) {
			if(m % i == 0 || m % (i+2) == 0) return false;
		}
		return true;
	}
	
	public static long assign_17(long n) {
		for(long i = n; i > 0; i--) {
			if(assign_14(i)) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(assign_17(999));
	}

}
