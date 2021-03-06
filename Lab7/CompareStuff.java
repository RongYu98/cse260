import java.util.*;

public class CompareStuff{



    /* 
Compare linked lists, ArrayList and arrays) Write a test program that stores 5 million integers in a linked list, ArrayList and array and test the time to insert, traverse and delete the elements (one by one). 

     */
    public static LinkedList<Integer> makeLinkedList( int size ){
	LinkedList<Integer> ints = new LinkedList<Integer>();
	for ( int i=0; i<size; i++ ){
	    ints.addLast( i );
	}
	return ints;
    }
    public static ArrayList<Integer> makeArrayList( int size ){
	ArrayList<Integer> ints = new ArrayList<Integer>();
	for ( int i=0; i<size; i++ ){
	    ints.add( i );
	}
	return ints;
    }
    public static int[]  makeArray( int size ){
	int[] ints = new int[size];
	for ( int i=0; i<size; i++ ){
	    ints[i] = i;
	}
	return ints;
    }

    
    public static void transverseWithGet( LinkedList<Integer> ints ){
	// int size = ints.size();
	for ( int i=0; i<ints.size(); i++ ){
	    ints.get(i);
	}
    }

    public static void removeLinkedList( LinkedList<Integer> ints ){
	while ( ints.size()>0 ){
	    ints.remove();
	}
    }
    public static void transverseArrayList( ArrayList<Integer> ints ){
	for ( int i=0; i<ints.size(); i++ ){
	    ints.get(i);
	}
    }
    public static void removeArrayList( ArrayList<Integer> ints ){
	for ( int i=0; i<ints.size(); i++ ){
	    ints.remove(i);
	}
    }
    
    public static void main(String[] args){

	long startTime = System.currentTimeMillis();
	LinkedList<Integer> ints1 = makeLinkedList( 5000 );
	long endTime = System.currentTimeMillis();
	long executionTime = endTime - startTime;
	System.out.println("Inserting for LinkedList: "+ executionTime);

	startTime = System.currentTimeMillis();
	transverseWithGet( ints1 );
	endTime = System.currentTimeMillis();
	executionTime = endTime - startTime;
	System.out.println("Transversing LinkedList: +");
	System.out.println( executionTime); // 1334
	System.out.println();
	startTime = System.currentTimeMillis();
	removeLinkedList( ints1 );
	endTime = System.currentTimeMillis();
	executionTime = endTime - startTime;
	System.out.println("Removing in LinkedList: +");
	System.out.println( executionTime); // 1334
	System.out.println();

	startTime = System.currentTimeMillis();
	ArrayList<Integer> ints2 = makeArrayList( 5000 );
	endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
	System.out.println("Inserting for ArrayList: "+ executionTime);
	startTime = System.currentTimeMillis();
	transverseArrayList( ints2 );
	endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
	System.out.println("Inserting for ArrayList: "+ executionTime);
	startTime = System.currentTimeMillis();
	removeArrayList( ints2 );
	endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
	System.out.println("Inserting for ArrayList: "+ executionTime);
	
	
	startTime = System.currentTimeMillis();
	int[] ints3 = makeArray( 5000 );
	endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
	System.out.println("Time for making array: "+ executionTime);
	
	startTime = System.currentTimeMillis();
	transverseArray( ints3 );
	endTime = System.currentTimeMillis();
	executionTime = endTime - startTime;
	System.out.println("Transversing for Array ");
	System.out.println(executionTime); // 2
	
	startTime = System.currentTimeMillis();
	removeArray( ints3 );
	endTime = System.currentTimeMillis();
	executionTime = endTime - startTime;
	System.out.println("Removing array: "+executionTime); // 2
	

	
	
    }





}
