package Test;

public class Car {

	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	public static int onwnerNumber = 2; 
	protected static final String ownerName = "Manas"; 
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setColour(String Colour) {
		this.colour = Colour;
	}
}


