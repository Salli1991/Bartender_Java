package bartender;

public class Main {

	public static void main(String[] args) {
		
		//Physische Inputs
		int available = 1; //Platzhalter
		int rfid = 0;	   //Platzhalter	
		//Schnittstellenvariablen
		User user[] = new User[0];
		Output output[] = new Output[5];
		Input input[] = new Input[1];
		double[] ingredients = new double[5];
		String[] ingredientNames = new String[5];
		
		for(int i=0; i<ingredientNames.length; i++) {
			ingredientNames[i] = "Zutat " + i;
		}
		for(int i=0; i<ingredients.length; i++) {
			ingredients[i] = 0;
			if(i==4)
				ingredients[i] = 100;
		}
		for(int i=0; i<output.length; i++) {
			output[i] = new Output(ingredients, ingredientNames, i, "timeBased", "small");
		}
		input[1] = new Input(ingredients, ingredientNames);
		
		if(rfid==available) {
			boolean x = true;
			for(int i=0; i<user.length; i++) {
				if(user[i].getRfid().equals(" " + rfid )) {
					output[1].serve(i);
					x = false;
				}			
			}
			if(x)
				user.push(ingredients, ingredientNames, "rfid", "Hans"); //Muss noch händisch programmiert werden
		}
		

	}

}
