import java.util.Stack;
import java.util.Scanner;
public class HanoiStuff{


    public static void main(String[] args) {
	//Scanner input = new Scanner(System.in);
	//System.out.print("Enter number of disks: ");
	//int n = input.nextInt(); System.out.println("The moves are:");
	//moveDisks(n, 'A', 'B', 'C');
	//System.out.println("\n\n\n");
	//moveDisks2(n, 'A', 'B', 'C');
	
	
	System.out.println( instanceof Number);
	
    }


    
    public static void moveDisks(int n, char fromTower, char toTower,
				 char auxTower) {
	
	Stack<Integer> ns = new Stack<Integer>();
	Stack<Character> fromTowers = new Stack<Character>();
	Stack<Character> toTowers = new Stack<Character>();
	Stack<Character> auxTowers = new Stack<Character>();
	
	if (n == 1) // Stopping condition
	    System.out.println("Move disk " + n + " from " +
			       fromTower + " to " + toTower);
	else {
	    ns.push( n );
	    fromTowers.push( fromTower );
	    toTowers.push( toTower );
	    auxTowers.push( auxTower );

	    Stack<String> messages = new Stack<String>();
	    Stack<String> total_messages = new Stack<String>();
	    
	    
	    while ( !ns.empty() ){
	        
		if ( ns.peek() == 1 ){ // Stopping condition
		    n = ns.pop();
		    fromTower = fromTowers.pop();
		    toTower = toTowers.pop();
		    auxTower = auxTowers.pop();
		    /*
		    System.out.println("Move disk " + n + " from " +
		    fromTower + " to " + toTower);*/
		    
		    total_messages.push("Move disk " + n + " from " +
				  fromTower + " to " + toTower);
		    total_messages.addAll( messages );
		    messages.clear();
		} else {
		    
		    n = ns.pop();
		    fromTower = fromTowers.pop();
		    toTower = toTowers.pop();
		    auxTower = auxTowers.pop();
		    
		    ns.push( n-1 );
		    fromTowers.push( fromTower );
		    toTowers.push( auxTower );
		    auxTowers.push( toTower );
		    
		    // moveDisks(n - 1, fromTower, auxTower, toTower);

		    messages.push("Move disk " + n + " from " +
				       fromTower + " to " + toTower);
		    //moveDisks(n - 1, auxTower, toTower, fromTower);
		    
		    ns.push( n-1 );
		    
		    fromTowers.push( auxTower );
		    toTowers.push( toTower );
		    auxTowers.push( fromTower );
		}
	    }
	    while ( !total_messages.empty() ){
		
		 System.out.println( total_messages.pop() );
	    }
	}
    }


 
    public static void moveDisks2(int n, char fromTower, char toTower,
				 char auxTower) {
	if (n == 1) // Stopping condition
	    System.out.println("Move disk " + n + " from " +
			       fromTower + " to " + toTower);
	else {
	    moveDisks(n - 1, fromTower, auxTower, toTower);
	    System.out.println("Move disk " + n + " from " +
			       fromTower + " to " + toTower);
	    moveDisks(n - 1, auxTower, toTower, fromTower);
	}
    }
}
