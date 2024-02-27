
public class Bai_18 {
	public static boolean assign_15(long m) {
		return (Math.pow((long)Math.pow(m, 0.5), 2) == m)? true: false;
	}
	
	public static boolean _assign_18(long n) {
		int s = 0;
		for(int i = 1; i*i <= n; i++) {
			if(n%i == 0) {
				s += i;
				s += n/i;
			}
		}
		s -= n;
		if(assign_15(n)) s -= Math.pow(n, 0.5);
		if(s == n) return true;
		return false;
	}
	
	public static void assign_18(long n) {
		for(int i = 1; i < n; i++) {
			if(_assign_18(i)) {
				System.out.print(i + " ");
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assign_18(94324);
	}

}
