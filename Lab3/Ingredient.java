public class Ingredient{

    private String name;
    private String measuringUnit;
    private int caloriesPerUnit;

    public Ingredient(String name, String measuringUnit, int caloriesPerUnit){
	this.name = name;
	this.measuringUnit = measuringUnit;
	this.caloriesPerUnit = caloriesPerUnit;

    }


    public String getName(){
	return name;
    }
    public String getMeasuringUnit(){
	return measuringUnit;
    }
    public int getCalories(){
	return caloriesPerUnit;
    }

    public String toString(){
	return "Ingredient \nName: "+ name + "\nMeasuringUnit: "+measuringUnit+
	    " \nCalories Per Unit: "+ caloriesPerUnit;
    }

    public boolean equals( Ingredient other ){
	if ( other.getName().equals(name) &&
	     other.getMeasuringUnit().equals(measuringUnit) &&
	     other.getCalories() == (caloriesPerUnit)){
	    return true;
	} return false;
    }
	       

}
