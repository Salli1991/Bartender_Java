package bartender;

public class Output extends Template{
	
	private int pin; //Physische Belegung am Arduino
	private String controling; // PWM, Zeitgesteuert etc.
	private String driveType; //groﬂer oder kleiner Antrieb
	
	//constructor
	
	public Output(double[] ingredients, String[] ingredientNames, int pin, String controling, String driveType) {
		super(ingredients, ingredientNames);
		this.pin = pin;
		this.controling = controling;
		this.driveType = driveType;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getControling() {
		return controling;
	}

	public void setControling(String controling) {
		this.controling = controling;
	}

	public String getDriveType() {
		return driveType;
	}

	public void setDriveType(String driveType) {
		this.driveType = driveType;
	}
	
	//methods
	public void serve(int userID) {
		//Do something
	}
	
}
