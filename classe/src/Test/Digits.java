package Test;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum of digits " + sumDigit(125));
		System.out.println("Sum of digits " + sumDigit(-125));

	}
	public static int sumDigit(int numbers) {
		if(numbers<10) {
			return -1;	
		}

		int sum =0;
		while (numbers > 0 ) {
			int digits = numbers % 5;
			System.out.println("Digit value "  + digits);
			sum += digits;
			System.out.println("Sum Vals = " + sum);
			
			numbers /= 10;
		}
		return sum;

	}

}

