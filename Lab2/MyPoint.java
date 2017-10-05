public class MyPoint{

    double xcor;
    double ycor;

    public MyPoint(){
	this( 0,0 );
    }
    public MyPoint( double x, double y ){
	xcor = x;
	ycor = y;
    }

    
    public double getX(){
	return xcor;
    }
    public double getY(){
	return ycor;
    }

    public double distance( MyPoint other ){
	double x = other.getX();
	double y = other.getY();
	return Math.sqrt( (x-xcor)*(x-xcor)+(y-ycor)*(y-ycor) );
    }
    public double distance( double x, double y ){
	return Math.sqrt( (x-xcor)*(x-xcor)+(y-ycor)*(y-ycor) );
    }
    
}
