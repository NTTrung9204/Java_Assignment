
public class Bai_7 {
	private static boolean checkLeapYear(int year) {
		if(year % 100 == 0) {
			if(year % 4 == 0) return true;
			return false;
		}
		return (year % 4 == 0)? true: false;
	}
	
	public static int daysInMonthAndYear(int month, int year) {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(daysInMonthAndYear(11, 2004));
	}

}
