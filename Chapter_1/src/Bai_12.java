
public class Bai_12 {
	public static int assign_12_sum(String s) {
		int sum = 0;
		for(char c: s.toCharArray()) {
			sum += c - '0';
		}
		return sum;
	}
	
	public static long assign_12_multi(String s) {
		int multi = 1;
		for(char c: s.toCharArray()) {
			multi *= c - '0';
		}
		return multi;
	}
	
	public static void assign_12(String s) {
		System.out.println("Sum of string: " + assign_12_sum(s));
		System.out.println("Sum of string: " + assign_12_multi(s));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assign_12("123456");
	}

}
