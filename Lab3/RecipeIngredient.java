public class RecipeIngredient extends Ingredient {

    private float quantity;
    
    public RecipeIngredient(String name, String measuringUnit,
			    int caloriesPerUnit,float quantity){
	super( name, measuringUnit, caloriesPerUnit );
	this.quantity = quantity;
    }


    public float getQuantity(){
	return quantity;
    }
    public void setQuantity( float F ){
	quantity = F;
    }

    public boolean equals( RecipeIngredient other ){
	if (super.equals( other ) && other.getQuantity() == quantity ){
	    return true;
	}
	return false;
    }

    public String toString(){
	return super.toString()+"\nQuantity: "+quantity;
    }
}
