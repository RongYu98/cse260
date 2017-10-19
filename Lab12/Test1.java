import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;

public class Test1{




    public static void main(String[] args){
	
	/*
	  Implement a Java 8 program that prints the distinct arguments passed to a program using a SortedSet and specify a Comparator so that case is ignored when sorting and identifying set elements.*/

	SortedSet<String> ss = new TreeSet<>( new Comparator<String>(){
		public int compare( String s1, String s2 ){
		    return ( s1.toUpperCase().compareTo(s2.toUpperCase() ) );
		}});
	for ( int i=0; i<args.length; i++ ){
	    ss.add(args[i]);
	}

	System.out.println(ss);
    }
	    
	    
	    

}
