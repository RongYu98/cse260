import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
import javax.swing.JOptionPane;


public class Lab1{

    final static int X_SYMBOL = 1253;
    final static int Y_SYMBOL = 3842;
    /**
       Write a program that reads in ten numbers and displays distinct numbers 
       (i.e., if a number appears multiple times, it is displayed only once). 
       Hint: Read a number and store it to an array if it is new. If the 
       number is already in the array, discard it. After the input, the array 
       contains the distinct numbers.
    */
    public static void distinctNumbers(){
	System.out.println("\n\nDistinct Numbers");
	System.out.println("Please enter 10 numbers");
	
	Scanner input = new Scanner(System.in);
	int[] nums = new int[10];
	int count = 0;
	///int j=0;
	for (int i=0; i<10; i++){
	    int newNumber = input.nextInt();
	    
	    int z;
	    for (z=0; z<count; z++){
		if ( nums[z] == newNumber ){
		    break;
		}
	    }
	    if ( z >= count ){ // reached end of known array, nothing
		nums[count] = newNumber;
		count++;
		//System.out.println("added");
	    } 
	}

	System.out.println();
	for (int i=0; i<count; i++){
	    System.out.print(nums[i]+" ");
	}
	System.out.println();
	
    }

    /** 
	(Timing execution) Write a program that randomly generates an array of 
	100000 integers and a key. Estimate the execution time of invoking the 
	linearSearch method from the lecture notes. Sort the array and 
	estimate the execution time of invoking the binarySearch method from 
	the lecture notes. You can use the following code template to obtain 
	the execution time:
    */
    public static void timingExecution(){
	int[] nums = new int[100000000];
	int key = (int)(Math.random()*100000000);
	
	for (int i=0; i<nums.length; i++){ // this works
	    nums[i] = (int)(Math.random()*100000000);
	}
	
	long startTime = System.currentTimeMillis();
	linearSearch( nums, key );
	long endTime = System.currentTimeMillis();
	long executionTime = endTime - startTime;

	System.out.println("Start Time: "+startTime);
	System.out.println("End Time: "+endTime);
	System.out.println("Linear Search took: "+ executionTime+"\n");
	
	
	Arrays.sort( nums );
	startTime = System.currentTimeMillis();
	binarySearch( nums, key );
	endTime = System.currentTimeMillis();
	executionTime = endTime - startTime;

	System.out.println("Start Time: "+startTime);
	System.out.println("End Time: "+endTime);
	System.out.println("Binary Search took: "+executionTime);
    }
    /** From lecture notes */
    public static int linearSearch( int[] numArray, int key ){
	
	for (int i=0; i<numArray.length; i++){
	    if (numArray[i] == key){
		return i;
	    }
	}
	return -1;
    }
    /** From lecture notes */
    public static int binarySearch(int[] list, int key) {
	int low = 0;
	int high = list.length - 1;
	while (high >= low) {
	    int mid = (low + high) / 2;
	    if (key < list[mid])
		high = mid - 1;
	    else if (key == list[mid])
		return mid;
	    else
		low = mid + 1;
	}
	return -1 - low;
    }



    public static void ticTackToe(){

	int[][] board = new int[3][3];
	
	// display board
	displayBoard( board );
	
	boolean valid = false;
	int p1x = 0;
	int p1y = 0;
	int p2x = 0;
	int p2y = 0;


	while (true){
	    // move 1
	    //while ( valid ){
	    String player1X = JOptionPane.showInputDialog( "Player 1, please enter a X coordinate");
	    String player1Y = JOptionPane.showInputDialog( "Player 1, please enter a Y coordinate");
	    p1x = Integer.valueOf( player1X );
	    p1y = Integer.valueOf( player1Y );
	    //}
	    //makeMove( board, xcor, ycor, X_SYMBOL );
	    board[p1x][p1y] = X_SYMBOL;

	    displayBoard( board );

	    if (wonGame( board )){
		System.out.println("PlAYER 1 WON!!");
		break;
	    }


	    String player2X = JOptionPane.showInputDialog( "Player 2, please enter a X coordinate");
	    String player2Y = JOptionPane.showInputDialog( "Player 2, please enter a Y coordinate");
	    p2x = Integer.valueOf( player2X );
	    p2y = Integer.valueOf( player2Y );

	    board[p2x][p2y] = Y_SYMBOL;
	    displayBoard( board );
	    
	    if (wonGame( board )){
		System.out.println("PlAYER 1 WON!!");
		break;
	    }

	}

    }

    public static boolean wonGame( int[][] board ){
	if ( board[0][0] == board[0][1] && board[0][1] == board[0][2] &&
	     ( board[0][0] == X_SYMBOL || board[0][0] == Y_SYMBOL ) ){
	    return true;
	}
	if ( board[1][0] == board[1][1] && board[1][1] == board[1][2] &&
	     ( board[1][0] == X_SYMBOL || board[1][0] == Y_SYMBOL ) ){
	    return true;
	}
	if ( board[2][0] == board[2][1] && board[2][1] == board[2][2] &&
	     ( board[2][0] == X_SYMBOL || board[2][0] == Y_SYMBOL ) ){
	    return true;
	}
	if ( board[0][0] == board[1][0] && board[1][0] == board[2][0] &&
	     ( board[0][0] == X_SYMBOL || board[0][0] == Y_SYMBOL ) ){
	    return true;
	}
	if ( board[0][1] == board[1][1] && board[1][1] == board[2][1] &&
	     ( board[0][1] == X_SYMBOL || board[0][1] == Y_SYMBOL ) ){
	    return true;
	}
	if ( board[0][2] == board[1][2] && board[1][2] == board[2][2] &&
	     ( board[0][2] == X_SYMBOL || board[0][2] == Y_SYMBOL ) ){
	    return true;
	}
	if ( board[0][0] == board[1][1] && board[1][1] == board[2][2] &&
	     ( board[0][0] == X_SYMBOL || board[0][0] == Y_SYMBOL ) ){
	    return true;
	}
	if ( board[0][2] == board[1][1] && board[1][1] == board[2][0] &&
	     ( board[0][2] == X_SYMBOL || board[0][2] == Y_SYMBOL ) ){
	    return true;
	}
	return false;
	
    }
    /*
    public static void makeMove( int[][] board, int x, int y, int symbol ){
	if (x>2){
	    x
    */
    public static void displayBoard( int[][] board ){
	for (int y=0; y<3; y++){
	    for (int x=0; x<3; x++){
		if ( board[x][y] == Y_SYMBOL ){
		    System.out.print( " Y " );
		}
		else if ( board[x][y] == X_SYMBOL ){
		    System.out.print( " X " );
		} else {
		    System.out.print( "   " );
		}
		if ( x != 2 ){
		    System.out.print("|");
		}		       
	    }
	    if ( y!= 2){
		System.out.println("\n-----------");
	    }

	}
	for (int i=0; i<4;i++){
	    System.out.println();
	}
    }



			   


    public static int howManyCollatzIterations(int n){
	if ( n == 1 ){
	    return 0;
	}
	if ( n%2==0 ){
	    return 1 + howManyCollatzIterations( n/2 );
	} else {
	    return 1 + howManyCollatzIterations( 3*n+1 );
	}
    }

    public static void main(String args[]){
	System.out.println("Collatz Iterations From 10: "+howManyCollatzIterations( 10 ) );
	System.out.println("Collatz Iterations From 100: "+howManyCollatzIterations( 100 ) );
	System.out.println("Collatz Iterations From 53: "+howManyCollatzIterations(53) );

	System.out.println("Timing Executions");
	timingExecution();

	distinctNumbers();

	ticTackToe();
    }
}

