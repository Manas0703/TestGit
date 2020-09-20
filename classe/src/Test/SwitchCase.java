package Test;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char charvalue = 'A';
		SwitchTest(charvalue);
		SwitchTest('C');
		printDayofTheWeek(-1);
		printDayofTheWeek(7);
		printDayofTheWeek(0);
		printDayofTheWeek(3);
	}
	public static void SwitchTest(char Vals) {
		switch (Vals) {
		case 'A': {
			System.out.println("Value is A");
			break;
		}
		default:
			System.out.println("Unexpected value: " + Vals);
			break;
			
		}
	}

	private static void printDayofTheWeek(int day) {
		switch (day) {
		case 0: {
				System.out.println("Sunday"); break; }
		case 1: {
			System.out.println("Monday"); break; }
		case 2: {
			System.out.println("Tueday");break; }
		case 3: {
			System.out.println("Wednesday");break; }
		case 4: {
			System.out.println("Thurday");break; }
		case 5: {
			System.out.println("Friday");break; }
		case 6: {
			System.out.println("Saturday");break; }
		default:
			System.out.println("Invalid value: " + day);
		}
	}
}
