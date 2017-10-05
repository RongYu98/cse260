import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class LinkedListNumbers{


    public static void main(String[] args){
	LinkedList<Integer> nums = new LinkedList<Integer>();
	for ( String I: args){
	    int i = Integer.valueOf(I);
	    boolean present = false;
	    for ( int j=0; j<nums.size(); j++ ){
		if ( nums.get(j) == i ){
		    present = true;
		}
	    } if (!present){
		nums.add( i );
	    }
	}
	System.out.println("Printing in Order: ");
	LinkedList ordered = (LinkedList)nums.clone();
	Collections.sort( ordered );
	System.out.println( ordered );
	System.out.println("Printing shuffled: ");
	LinkedList shuffled = (LinkedList)nums.clone();
	Collections.shuffle( shuffled );
	System.out.println( shuffled );
	LinkedList reversed = (LinkedList)nums.clone();
	Collections.reverse( reversed );
	System.out.println( reversed );
    }
}
