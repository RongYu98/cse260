import java.util.ArrayList;

public class CookingRecipe{

    private String name;
    ArrayList<RecipeIngredient> ingredientNames;
    ArrayList<Float> ingredientQuantities;



    public CookingRecipe(String name){
	this.name = name;
    }

    public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity){
	int index = -1;
	for ( int i=0; i<ingredientNames.size(); i++ ){
	    if ( ingredientNames.get(i).getName().equals(ingredient.getName()) ){
	        index = i;
		break;
	    }
	}
	if ( index == -1 ){ // if not present, make new and add
	    RecipeIngredient RI = new RecipeIngredient( ingredient.getName(),
							ingredient.getMeasuringUnit(),
							ingredient.getCalories(),
							quantity );
	    ingredientNames.add( RI );
	} else { // if present, set that current index to the current + quantity
	    ingredientNames.get(index).setQuantity( ingredientNames.get(index)
						    .getQuantity()+quantity );
	}
	
    }

    public RecipeIngredient getRecipeIngredient(Ingredient ingredient){
	for ( RecipeIngredient RI : ingredientNames ){
	    if ( RI.getName().equals( ingredient.getName() ) ){
		return RI;
	    }
	} return null;
    }
    
    public RecipeIngredient getRecipeIngredient(String ingredientName){
	for ( RecipeIngredient RI : ingredientNames ){
	    if ( RI.getName().equals( ingredientName ) ){
		return RI;
	    }
	} return null;
    }

    
    public RecipeIngredient removeRecipeIngredient(Ingredient ingredient){
        RecipeIngredient RI = getRecipeIngredient( ingredient );
	if ( RI == null ){
	    return null;
	}
	ingredientNames.remove( RI );
	return RI;
    }
	    
    public RecipeIngredient removeRecipeIngredient(String ingredientName){
	RecipeIngredient RI = getRecipeIngredient( ingredientName );
	if ( RI == null ){
	    return null;
	}
	ingredientNames.remove( RI );
	return RI;
    }
    
    public float calculateCalories(){
	float count = 0;
	for ( RecipeIngredient RI : ingredientNames ){
	    count += RI.getCalories() * RI.getQuantity();
	} return count;
    }

    public int getNumberOfIngredients(){
	return ingredientNames.size();
    }

    public String toString(){
	String all = name;
	for ( RecipeIngredient RI : ingredientNames ){
	    all += "\n"+RI.getName();
	}
	return all;
    }

    public String getName(){
	return name;
    }

    public int getIngredientListSize(){
	return ingredientNames.size();
    }

    public boolean equals( CookingRecipe other ){
	return other.toString().equals( this.toString());
    }
    
}
