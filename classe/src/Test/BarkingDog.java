package Test;

public class BarkingDog {

	public static void main(String[] args) {
		shouldWakeUp(false, 2);
		shouldWakeUp(true, 1);
		shouldWakeUp(true, 8);
		shouldWakeUp(true, -1);
	}



	public static boolean shouldWakeUp(boolean barking, int hourOfDay){ 
		if(barking == true){ 
			if(hourOfDay < 8 || hourOfDay > 22){
				if(hourOfDay >= 0 && hourOfDay <= 23){ 
					System.out.println("Correct timings"); 
					return true; 
				} else{
					System.out.println("Incorrect timings"); 
					return false; 
				} 
			} else{
				System.out.println("Barking but in safe timimngs"); 
				return false; 
			} 
		} else{
			System.out.println("No Barking"); 
			return false; 
		} 
	}

}
