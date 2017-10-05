public class TestMyPoint{


    public static void main(String args[]){
	
	MyPoint point1 = new MyPoint();
	MyPoint point2 = new MyPoint( 10, 30.5 );


	System.out.println("Point 1: x: "+ point1.getX()+" y: "+point1.getY());
	System.out.println("Point 2: x: "+ point2.getX()+" y: "+point2.getY());    

	System.out.println("Distance between two is: "+point1.distance( point2 ) );
	System.out.println("Distance between two is: "+point1.distance( 10, 30.5 ));  
    }

}
