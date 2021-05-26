package bartender;

public class User extends Template{
	
	//private variables

	private String rfid;
	private String name;
	private int drinks;
	private double cycleTime;
	private double alcohol;
	
	//constructor
	public User(double[] ingredients, String[] ingredientNames, String rfid, String name) {
		super(ingredients, ingredientNames);
		this.rfid = rfid;
		this.name = name;
	}

	public String getRfid() {
		return rfid;
	}

	public void setRfid(String rfid) {
		this.rfid = rfid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDrinks() {
		return drinks;
	}

	public void setDrinks(int drinks) {
		this.drinks = drinks;
	}

	public double getCycleTime() {
		return cycleTime;
	}

	public void setCycleTime(double cycleTime) {
		this.cycleTime = cycleTime;
	}

	public double getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(double alcohol) {
		this.alcohol = alcohol;
	}
	
}
