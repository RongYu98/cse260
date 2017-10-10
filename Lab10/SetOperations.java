import java.util.LinkedHashSet;


public class SetOperations{


    public static LinkedHashSet<String> union( LinkedHashSet<String> s1, LinkedHashSet<String> s2 ){
	LinkedHashSet<String> set1 = (LinkedHashSet<String>) s1.clone();
	LinkedHashSet<String> set2 = (LinkedHashSet<String>) s2.clone();

	for ( String thing : set2 ){
	    if ( !set1.contains( thing ) ){
		    set1.add( thing );
	    }
	}
	return set1;
    }

    public static LinkedHashSet<String> difference( LinkedHashSet<String> s1, LinkedHashSet<String> s2 ){
	LinkedHashSet<String> set1 = (LinkedHashSet<String>) s1.clone();
	LinkedHashSet<String> set2 = (LinkedHashSet<String>) s2.clone();

	for ( String thing : set2 ){
	    if ( set1.contains( thing ) ){
		    set1.remove( thing );
	    }
	}
	return set1;
    }

    public static LinkedHashSet<String> intersection( LinkedHashSet<String> s1, LinkedHashSet<String> s2 ){
	LinkedHashSet<String> set1 = (LinkedHashSet<String>) s1.clone();
	LinkedHashSet<String> set2 = (LinkedHashSet<String>) s2.clone();
	LinkedHashSet<String> set3 = new LinkedHashSet<String>();
	
	for ( String thing : set2 ){
	    if ( set1.contains( thing ) ){
		    set3.add( thing );
	    }
	}
	return set3;
    }
    
    public static void main(String[] args){
	LinkedHashSet<String> set1 = new LinkedHashSet<>();
	set1.add("George");
	set1.add("Jim");
	set1.add("John");
	set1.add("Blake");
	set1.add("Kevin");
	set1.add("Michael");
	LinkedHashSet<String> set2 = new LinkedHashSet<>();
	set2.add("George");
	set2.add("Katie");
	set2.add("Kevin");
	set2.add("Michelle");
	set2.add("Ryan");

	System.out.println();
	System.out.println("Set 1: "+set1);
	System.out.println("Set 2: "+set2);
	System.out.println();
	System.out.println("Union: "+ SetOperations.union( set1, set2 ) );
	System.out.println();
	System.out.println("Difference of Set 1 and Set 2: ");
	System.out.println(SetOperations.difference( set1, set2 )) ;
	System.out.println();
	System.out.println("Difference of Set 2 and Set 1: ");
	System.out.println(SetOperations.difference( set2, set1 ) );
	System.out.println();
	System.out.println("Intersection fo Set 1 and Set 2: ");
	System.out.println(SetOperations.intersection( set1, set2 ));
	System.out.println("\n\n");
			   
    }

}
