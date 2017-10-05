public class Max{


    public static <E extends Comparable<E>> E max(E[] list){
	E MAX = list[0];
	for ( E data : list ){
	    if ( MAX.compareTo( data ) < 0 ){
		MAX = data;
	    }
	}
	return MAX;

    }

}
