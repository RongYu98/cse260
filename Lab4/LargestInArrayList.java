import java.util.ArrayList;

public class LargestInArrayList{

    public static <E extends Comparable<E>> E max(ArrayList<E> list){
	E maximum = list.get(0);
	for ( int i=0; i<list.size(); i++ ){
	    if ( list.get(i).compareTo( maximum ) > 0 ){
		maximum = list.get(i);
	    }
	}
	return maximum;


    }

}
