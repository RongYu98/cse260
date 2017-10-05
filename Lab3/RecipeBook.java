import java.util.ArrayList;

public class RecipeBook{

    public String bookName;
    private ArrayList<CookingRecipe> cookingRecipes;
    
    public RecipeBook(String bookName){
	this.bookName = bookName;
    }


    public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients){
	for ( CookingRecipe CR : cookingRecipes ){
	    if ( CR.getName().equals( name ) ){
		return null;
	    }
	}
	
	CookingRecipe cr = new CookingRecipe( name );
	for ( RecipeIngredient RI : ingredients ){
	    cr.addOrUpdateRecipeIngredient( RI, RI.getQuantity() );
	}
	cookingRecipes.add( cr );
	return cr;
    }


    public CookingRecipe removeRecipe(String name){
	for ( CookingRecipe CR : cookingRecipes ){
	    if ( CR.getName().equals( name )){
		cookingRecipes.remove(CR);
		return CR;
	    }
	} return null;
    }

    public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients){
	ArrayList<CookingRecipe> crs = new ArrayList<CookingRecipe>();
	for ( CookingRecipe CR : cookingRecipes ){
	    boolean hasAll = true;
	    for ( RecipeIngredient RI : ingredients ){
		if ( CR.getRecipeIngredient( RI ) == null ){
		    hasAll = false;
		}
	    }
	    if ( hasAll ){
		crs.add( CR );
	    }
	}
	if ( crs.size() == 0 ){
	    return null;
	}
	CookingRecipe[] CRS = new CookingRecipe[ crs.size() ];
	for ( int i=0; i<CRS.length; i++ ){
	    CRS[i] = crs.get(i);
	}
	return CRS;
    }


    public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients){
	ArrayList<CookingRecipe> crs = new ArrayList<CookingRecipe>();
	for ( CookingRecipe CR : cookingRecipes ){
	    if ( CR.getIngredientListSize() < numberOfIngredients ){
		crs.add( CR );
	    }
	}
	if ( crs.size() == 0 ){
	    return null;
	}
	CookingRecipe[] CRS = new CookingRecipe[ crs.size() ];
	for ( int i=0; i<CRS.length; i++ ){
	    CRS[i] = crs.get(i);
	}
	return CRS;
    }
    
    public CookingRecipe[] findRecipesLowCalories(){
	ArrayList<CookingRecipe> crs = new ArrayList<CookingRecipe>();
	float min = cookingRecipes.get(0).calculateCalories();
	for ( CookingRecipe CR : cookingRecipes ){
	    if ( CR.calculateCalories() == min ){
		crs.add( CR );
	    } else if ( CR.calculateCalories() < min ){
		min = CR.calculateCalories();
		crs.clear();
		crs.add( CR );
	    }
	}
	    
	if ( crs.size() == 0 ){
	    return null;
	}
	CookingRecipe[] CRS = new CookingRecipe[ crs.size() ];
	for ( int i=0; i<CRS.length; i++ ){
	    CRS[i] = crs.get(i);
	}
	return CRS;
    }

    public String toString(){
	String all = "Name: "+bookName;
	for ( CookingRecipe CR : cookingRecipes ){
	    all +="\n"+ CR.toString();
	}
	return all;
    }
    public boolean equals(RecipeBook other ){
	return this.toString().equals(other.toString());
    }
    
}
