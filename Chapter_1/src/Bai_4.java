
public class Bai_4 {
	public static void solveSystemOfLinearQuation(double a, double b, double c, double d, double e, double f) {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solveSystemOfLinearQuation(1, 2, 3, 4, 5, 6);
	}

}
