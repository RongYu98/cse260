import java.util.LinkedList;
import java.util.*;
public class LinkedListIt{

    /* Use iterators on linked lists) Write a test program that stores 5 million integers in a linked list and test the time to traverse the list using an iterator vs. using the get(index) method.
     */
    public static LinkedList<Integer> makeList( int size ){
	LinkedList<Integer> ints = new LinkedList<Integer>();
	for ( int i=0; i<size; i++ ){
	    ints.addLast( i );
	}
	return ints;
    }

    public static void transverseWithGet( LinkedList<Integer> ints ){
	// int size = ints.size();
	for ( int i=0; i<ints.size(); i++ ){
	    ints.get(i);
	}
    }

    public static void transverseIterator( LinkedList<Integer> ints ){
	ListIterator<Integer> it = ints.listIterator(0);
	while ( it.hasNext() ){
	    it.next();
	}
    }
    
    public static void main(String[] args){
	LinkedList<Integer> ints1 = makeList( 50000 );
	// LinkedList<Integer> ints2 = makeList( 5000000 );

	long startTime = System.currentTimeMillis();
	transverseWithGet( ints1 );
	long endTime = System.currentTimeMillis();
	long executionTime = endTime - startTime;
	System.out.println("Execution Time of Transversing with Get: ");
	System.out.println( executionTime); // 1334
	System.out.println();

	startTime = System.currentTimeMillis();
	transverseIterator( ints1 );
	endTime = System.currentTimeMillis();
	executionTime = endTime - startTime;
	System.out.println("Execution Time of Transversing with Iterator: ");
	System.out.println(executionTime); // 2
	
	
    }



}
