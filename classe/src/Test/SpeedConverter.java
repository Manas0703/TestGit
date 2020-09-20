package Test;

public class SpeedConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long miles = toMilesPerHour(2);
		System.out.println("miles = " + miles);
		miles = toMilesPerHour(5);
		System.out.println("miles = " + miles);
		miles = toMilesPerHour(0);
		System.out.println("miles = " + miles);
		printConversion(5);
		printConversion(0);
		printConversion(10.5);
		
	}
	
	public static long toMilesPerHour(double KilometersPerHour)  {
		if(KilometersPerHour < 0) {
			return -1;		}
		long milesPerHour = Math.round(KilometersPerHour/1.609);
		return milesPerHour;
	}

	public static void printConversion(double KilometersPerHour) {
		if(KilometersPerHour < 0) {
			System.out.println("Invalid Value");
		}
	else {
		long milesPerHour = toMilesPerHour(KilometersPerHour);
		System.out.println(KilometersPerHour + " km/h = " + milesPerHour + " mi/h");
	}
	}
	
}
