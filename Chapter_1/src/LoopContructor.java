//import java.lang.Math;

public class LoopContructor {
	public double assign_1(int n) {
		if(n == 1) return 1.0;
		return (double)1/n+assign_1(n-1);
	}
	
	public long factorial(int n) {
		if(n == 1) return 1;
		return n*factorial(n-1);
	}
	
	public double _seriFactorial(int n) {
		if(n==1) return -1;
		if(n%2 == 0) {
			return (double)1/factorial(n) + _seriFactorial(n-1);
		}
		return -(double)1/factorial(n) + _seriFactorial(n-1);
	}
	
	public double assign_2(int n) {
		return 15 + _seriFactorial(n);
	}
	
	public double assign_3(int n) {
		return (n == 1)? 1 : 1.0/factorial(2*n-1) + assign_3(n-1);
	}
	
	public long assign_4(int n) {
		if(n == 0 || n == 1) return 1;
		return n*assign_4(n-2);
	}
	
	public int assign_4_sum(String s) {
		int sum = 0;
		for(char c: s.toCharArray()) {
			sum += c - '0';
		}
		return sum;
	}
	
	public long assign_4_multi(String s) {
		int multi = 1;
		for(char c: s.toCharArray()) {
			multi *= c - '0';
		}
		return multi;
	}
	
	public void assign_4(String s) {
		System.out.println("Sum of string: " + assign_4_sum(s));
		System.out.println("Sum of string: " + assign_4_multi(s));
	}
	
	public long assign_5_GCD(int a, int b) {
		if(b == 0) return a;
		return assign_5_GCD(b, a % b);
	}
	
	public long assign_5_LCM(int a, int b) {
		return a*b / assign_5_GCD(a, b);
	}
	
	public boolean assign_6(long m) {
		if(m < 2) return false;
		if(m < 4) return true;
		if(m % 2 == 0 || m % 3 == 0) return false;
		for(int i = 5; i*i <= m; i+=6) {
			if(m % i == 0 || m % (i+2) == 0) return false;
		}
		return true;
	}
	
	public boolean assign_7(long m) {
		return (Math.pow((long)Math.pow(m, 0.5), 2) == m)? true: false;
	}
	
	public boolean assign_8(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
		}
		return true;
	}
	
	public long assign_9(long n) {
		for(long i = n; i > 0; i--) {
			if(assign_6(i)) return i;
		}
		return -1;
	}
	
	public boolean _assign_10(long n) {
		int s = 0;
		for(int i = 1; i*i <= n; i++) {
			if(n%i == 0) {
				s += i;
				s += n/i;
			}
		}
		s -= n;
		if(assign_7(n)) s -= Math.pow(n, 0.5);
		if(s == n) return true;
		return false;
	}
	
	public void assign_10(long n) {
		for(int i = 1; i < n; i++) {
			if(_assign_10(i)) {
				System.out.print(i + " ");
			}
			
		}
	}
	
	public void assign_11(int n) {
		long a = 1, b = 1, c;
		System.out.print(1 + " ");
		for(int i = 1; i < n; i++) {
			System.out.print(b + " ");
			c = b;
			b += a;
			a = c;
		}
	}
	
	public int assign_12(long n) {
		long a = 1, b = 1, c;
		int index = 2;
		while(true) {
			if(b == n) return index;
			c = b;
			b += a;
			a = c;
			index++;
		}
	}
	
	
}