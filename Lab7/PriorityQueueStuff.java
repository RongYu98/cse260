import java.util.PriorityQueue;

public class PriorityQueueStuff {

    public static PriorityQueue<String> union( PriorityQueue<String> pq1, PriorityQueue<String> pq2 ){
	PriorityQueue<String> unionized = new PriorityQueue<String>();
	while ( pq1.size()>0 || pq2.size()>0 ){
	   
	    if ( pq1.size()==0 ){
		unionized.offer( pq2.poll() );
	    } else if ( pq2.size()==0 ){
		unionized.offer( pq1.poll() );
	    } else {
		if ( pq1.peek().compareTo( pq2.peek() ) < 0 ){
		    unionized.offer( pq1.poll() );
		} else if ( pq1.peek().compareTo( pq2.peek() )==0 ){
		    unionized.offer( pq1.poll() );
		    pq2.poll();
		} else {
		    unionized.offer( pq2.poll() );
		}
	    }
	}
	return unionized;

    }

    public static PriorityQueue<String> diff( PriorityQueue<String> pq1, PriorityQueue<String> pq2 ){
	PriorityQueue<String> difference = new PriorityQueue<String>();
	while ( pq1.size()>0 ){
	    /*
	    System.out.println( pq1 );
	    System.out.println( pq2 );
	    System.out.println( difference );
	    System.out.println();
	    */
	    if ( pq2.size()==0 ){
		difference.offer( pq1.poll() );
	    } else if ( pq1.peek().compareTo( pq2.peek() )==0 ){
		pq1.poll();
		pq2.poll();
	    } else if ( pq1.peek().compareTo( pq2.peek() )>0 ){
		pq2.poll();
	    } else {
		difference.offer( pq1.poll() );
	    }
	}
	return difference;
	
    }

     public static PriorityQueue<String> intersect( PriorityQueue<String> pq1, PriorityQueue<String> pq2 ){
	PriorityQueue<String> difference = new PriorityQueue<String>();
	while ( pq1.size()>0 && pq2.size()>0 ){
	    /*
	    System.out.println( pq1 );
	    System.out.println( pq2 );
	    System.out.println( difference );
	    System.out.println();
	    */
	    if ( pq1.peek().compareTo( pq2.peek() )==0 ){
		difference.offer(pq1.poll());
		pq2.poll();
	    } else if ( pq1.peek().compareTo( pq2.peek() )>0 ){
		pq2.poll();
	    } else {
		pq1.poll();
	    }
	}
	return difference;
	
    }

    
    

    public static void main(String[] args){
	PriorityQueue<String> names1 = new PriorityQueue<String>();
	PriorityQueue<String> names2 = new PriorityQueue<String>();

	names1.offer("George");
	names1.offer("Jim");
	names1.offer("John");
	names1.offer("Blake");
	names1.offer("Kevin");
	names1.offer("Micheal");

	names2.offer("George");
	names2.offer("Katie");
	names2.offer("Kevin");
	names2.offer("Michelle");
	names2.offer("Ryan");

	PriorityQueue<String> union = union( names1, names2 );
	names1.offer("George");
	names1.offer("Jim");
	names1.offer("John");
	names1.offer("Blake");
	names1.offer("Kevin");
	names1.offer("Micheal");

	names2.offer("George");
	names2.offer("Katie");
	names2.offer("Kevin");
	names2.offer("Michelle");
	names2.offer("Ryan");
	PriorityQueue<String> diff1 = diff( names1, names2 );
	names1.clear();
	names1.offer("George");
	names1.offer("Jim");
	names1.offer("John");
	names1.offer("Blake");
	names1.offer("Kevin");
	names1.offer("Micheal");
	names2.clear();
	names2.offer("George");
	names2.offer("Katie");
	names2.offer("Kevin");
	names2.offer("Michelle");
	names2.offer("Ryan");
	PriorityQueue<String> diff2 = diff( names2, names1 );
	names1.clear();
	names1.offer("George");
	names1.offer("Jim");
	names1.offer("John");
	names1.offer("Blake");
	names1.offer("Kevin");
	names1.offer("Micheal");
	names2.clear();
	names2.offer("George");
	names2.offer("Katie");
	names2.offer("Kevin");
	names2.offer("Michelle");
	names2.offer("Ryan");
	PriorityQueue<String> intersection = intersect( names1, names2 );
	names1.clear();
	names1.offer("George");
	names1.offer("Jim");
	names1.offer("John");
	names1.offer("Blake");
	names1.offer("Kevin");
	names1.offer("Micheal");
	names2.clear();
	names2.offer("George");
	names2.offer("Katie");
	names2.offer("Kevin");
	names2.offer("Michelle");
	names2.offer("Ryan");
	System.out.println("Group 1: "+names1);
	System.out.println("Group 2: "+names2);
	System.out.println();
	System.out.println( "Union of Group 1 and Group 2: "+union );
	System.out.println();
	System.out.println( "Difference of Group 1 and Group 2: "+diff1 );
	System.out.println( "Difference of Group 2 and Group 1: "+diff2 );
	System.out.println();
	System.out.println( "Intersection of Group 1 and Group 2: "+intersection);
		
	
	
    }


}
