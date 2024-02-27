
public class Bai_6 {
	public static int caculatePrice(int a, int b) {
		return (b < 18)? (b - a) * 45000 : (b - a) * 60000;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(caculatePrice(12, 19));
	}

}
