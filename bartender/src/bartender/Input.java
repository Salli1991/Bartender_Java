package bartender;

public class Input extends Template{
	
	//variables
	private int level;
	private int stage;
	
	//constructor
	public Input(double[] ingredients, String[] ingredientNames) {
		super(ingredients, ingredientNames);
		this.level = 0;
		this.stage = 0;
	}
	
	//methods
	public void checkInput(String button) {
		if(button.equals("up")) 
			level++;
		else if(button.equals("down"))
			level--;
		else if(button.equals("left"))
			stage--;
			stage++;
	}
	public void ausgabe() {
		if(level==0)
			System.out.println("Benutzer " + (stage+1) );
		if(level==1)
			System.out.println("Getränk " + (stage+1));
		if(level==2)
			System.out.println("Mischung " + this.getIngredients()[stage]); 
	}
//ladida
}
