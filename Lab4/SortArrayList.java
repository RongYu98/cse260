import java.util.ArrayList;
//import java.util.Math;


public class SortArrayList{

    public static <E extends Comparable<E>> void sort(ArrayList<E> list){

	ArrayList<E> sorted = new ArrayList<E>();

	//E[] sorted = new E[ list.size() 
	
	int size = list.size();
	for ( int i=0; i<size; i++){
	    E min = list.get(0);
	    for ( int j=0; j<list.size(); j++ ){
		if ( min.compareTo(list.get(j))>0 ){
		    min = list.get(j);
		}
	    }
	    sorted.add( min );
	    list.remove(min);
	}
	for ( int i=0; i<size; i++ ){
	    list.add( sorted.get(i) );
	}
    }

    public static void main(String[] args){

	ArrayList<Integer> numbers = new ArrayList<Integer>();
	for ( int i=0; i<20; i++ ){
	    numbers.add( (int)( Math.random()*50 ));
	}
	sort( numbers );
	System.out.println( numbers );
    }

}
