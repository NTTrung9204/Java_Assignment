
public class Bai_14 {
	public static boolean assign_14(long m) {
		if(m < 2) return false;
		if(m < 4) return true;
		if(m % 2 == 0 || m % 3 == 0) return false;
		for(int i = 5; i*i <= m; i+=6) {
			if(m % i == 0 || m % (i+2) == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(assign_14(997));
	}

}
