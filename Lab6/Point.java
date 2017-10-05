


public class Point implements Comparable{

    int x;
    int y;

    public Point( int x, int y ){
	this.x=x;
	this.y=y;
    }

    @Override 
    public int compareTo( Object o ){
	Point other = (Point)o;

	if ( x!=other.getX() ){
	    return x-other.getX();
	}
	return y-other.getY();
    }

    public int getX(){
	return x;
    }
    public int getY(){
	return y;
    }




}
