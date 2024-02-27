
public class Bai_2 {
	
	public static void solveLinearEquation(double a, double b) {
		if(a == 0) {
			if(b == 0) System.out.println("This equation have infinity root!");
			if(b != 0) System.out.println("This equation don't have any roots!");
		}
		else {
			System.out.println(-b/a + " is root of this equation");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solveLinearEquation(3, 5);
	}

}
