package Test;

public class Main {

	public static void main(String[] args) {
		Car porsche = new Car();
		Car merc = new Car();
		System.out.println("Model is "+ porsche.getModel());
		porsche.setModel("Carrera");
		System.out.println("Model is "+ porsche.getModel());
		System.out.println("Car onwnerNumber is changed to = " + Car.onwnerNumber );
		Car.onwnerNumber = 4;
		System.out.println("Car onwnerNumber is changed to = " + Car.onwnerNumber );
		System.out.println("Car onwnerNumber is changed to = " + Car.ownerName);
		//Car.ownerName = "Mehta";
		//System.out.println("Car onwnerNumber is changed to = " + Car.ownerName);


	}

public String mixString(String a, String b) {
		  String newStr = "";
		  int len = a.length();
		  int len1 = b.length();
		    for (int i = 0; i < len; i++) {
		      newStr += a.substring(i, i+1);
		     for (int j = 0; j < len1; j++) {
		    	 newStr += a.substring(j, j+1);
		    } 
		    
		    }
		    return newStr;
		  }

}
