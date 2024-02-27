
public class Bai_3 {
	
	public static void solveQuadraticEquation(double a, double b, double c) {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solveQuadraticEquation(2, 3, 4);
	}

}
