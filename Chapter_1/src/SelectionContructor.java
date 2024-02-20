import java.lang.Math;

public class SelectionContructor {
	public double maxOfThree(double a, double b, double c) {
		if(a >= b && b >= c) return a;
		if(a >= c && c >= b) return a;
		if(b >= a && a >= c) return b;
		if(b >= c && c >= a) return b;
		if(c >= a && a >= b) return c;
		return c;
	}
	
	public void solveLinearEquation(double a, double b) {
		if(a == 0) {
			if(b == 0) System.out.println("This equation have infinity root!");
			if(b != 0) System.out.println("This equation don't have any roots!");
		}
		else {
			System.out.println(-b/a + " is root of this equation");
		}
	}
	
	public void solveQuadraticEquation(double a, double b, double c) {
		if(a == 0) {
			System.out.println("This equation isn't quadratic equation!");
		}
		else {
			double delta = b*b - 4*a*c;
			if(delta < 0) {
				System.out.println("This equation don't have any roots!");
			}
			if(delta == 0) {
				System.out.println("This equation only have one root: " + (-b/(2*a)));
			}
			if(delta > 0) {
				double rootOfDelta = Math.pow(delta, 0.5);
				double fristRoot = (-b + rootOfDelta) / (2*a);
				double secondRoot = (-b - rootOfDelta) / (2*a);
				System.out.println("This equation there are two roots: " + fristRoot + " and " + secondRoot);
			}
			
		}
	}
	
	public void solveSystemOfLinearQuation(double a, double b, double c, double d, double e, double f) {
		double deltaX = c*e - b*f;
		double deltaY = a*f - c*d;
		double delta  = a*e - b*d;
		if(delta == 0) {
			if(deltaX != 0 || deltaY != 0) {
				System.out.println("This system equation don't have any roots!");
			}
			else {
				System.out.println("This equation have infinity root!");
			}
		}
		else {
			System.out.println("Root of system equation : (x, y) = (" + deltaX/delta + "," + deltaY/delta + ")");
		}
	}
	
	public double medianNumber(double a, double b, double c) {
		if(a >= b && b >= c) return b;
		if(a >= c && c >= b) return c;
		if(b >= a && a >= c) return a;
		if(b >= c && c >= a) return c;
		if(c >= a && a >= b) return a;
		return b;
	}
	
	public int caculatePrice(int a, int b) {
		return (b < 18)? (b - a) * 45000 : (b - a) * 60000;
	}
	
	private boolean checkLeapYear(int year) {
		if(year % 100 == 0) {
			if(year % 4 == 0) return true;
			return false;
		}
		return (year % 4 == 0)? true: false;
	}
	
	public int daysInMonthAndYear(int month, int year) {
		switch(month){
			case 2: return (checkLeapYear(year))? 29 : 28;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: return 31;
			case 4:
			case 6:
			case 9:
			case 11: return 30;
			default: return -1;
		}
	}
	
}
