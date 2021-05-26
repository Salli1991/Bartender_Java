package bartender;

public class Template {

	//private variables
	private double[] ingredients;
	private String[] ingredientNames;
	
	//constructor
	public Template(double[] ingredients, String[] ingredientNames) {
		super();
		this.ingredients = ingredients;
		this.ingredientNames = ingredientNames;
	}

	public double[] getIngredients() {
		return ingredients;
	}

	public void setIngredients(double[] ingredients) {
		this.ingredients = ingredients;
	}

	public String[] getIngredientNames() {
		return ingredientNames;
	}

	public void setIngredientNames(String[] ingredientNames) {
		this.ingredientNames = ingredientNames;
	}

}
