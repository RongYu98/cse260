import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class NumberOccurrences{

    public static void main(String[] args){

	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	Scanner scanner = new Scanner( System.in );

	int input = scanner.nextInt();
	while ( input!=0 ){
	     if ( !map.containsKey( input ) ){
		 map.put( input, 1 );
	     } else {
		 map.put( input, map.get(input)+1 );
	     }
	     input = scanner.nextInt();
	}
	
	int maxNumber = 0;

	Set<Integer> mapSet = map.keySet();
	Iterator<Integer> it = mapSet.iterator();

	int num;
	while ( it.hasNext() ){
	    num = it.next();
	    if ( map.get( num ) > maxNumber ){
		maxNumber = num;
	    }
	}

	mapSet = map.keySet();
	it = mapSet.iterator();
	while ( it.hasNext() ){
	    num = it.next();
	    if ( map.get( num ) == maxNumber ){
		System.out.println(num+" has the most occurances at: "+map.get(num));
	    }
	}
	
    }




}
