import java.util.Comparator;
public class Compare_Y implements Comparator{

    public int compare( Object o1, Object o2 ){
	Point p1 = (Point) o1;
	Point p2 = (Point) o2;

	if ( p1.getY() != p2.getY() ){
	    return p1.getY()-p2.getY();
	}
	return ( p1.getX() - p2.getX());
    }


}
