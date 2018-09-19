
public class doubleNumber {

	public static void main(String[] args) {
		double doubleNumber = 10.0;
		int integerNumber = 10;
		
		boolean equal = doubleNumber == integerNumber;
		System.out.println(equal);
		System.out.println(doubleNumber != integerNumber);
		
		if (doubleNumber == integerNumber) {
			System.out.println("double == integer");
		} else {
			System.out.println("double != integer");
		}

	}

}

