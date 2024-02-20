
public class subTest {
	public static int Factor(int x) {
		if(x > 1)return subTest.Factor(x-1)*x;
		return 1;
	}

	public static void main(String[] args) {
		for(int i = 0; i < 14; i++) {
			System.out.println(subTest.Factor(i));
		}
	}

}

