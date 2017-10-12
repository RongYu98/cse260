import java.util.Scanner;
import java.util.HashMap;
public class GuessCapitals{

    public static String[][] SAC = { // got this from stack overflow
        {"Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"},
        {"Montgomery","Juneau","Phoenix","Little Rock","Sacramento","Denver","Hartford","Dover","Tallahassee","Atlanta","Honolulu","Boise","Springfield","Indianapolis","Des Moines","Topeka","Frankfort","Baton Rouge","Augusta","Annapolis","Boston","Lansing","St. Paul","Jackson","Jefferson City","Helena","Lincoln","Carson City","Concord","Trenton","Santa Fe","Albany","Raleigh","Bismarck","Columbus","Oklahoma City","Salem","Harrisburg","Providence","Columbia","Pierre","Nashville","Austin","Salt Lake City","Montpelier","Richmond","Olympia","Charleston","Madison","Cheyenne"}};

    public static void main(String[] args){
	HashMap<String, String> map = new HashMap<String, String>();
	for ( int i=0; i<50; i++ ){
	    map.put( SAC[0][i].toUpperCase(), SAC[1][i] );
	}

	Scanner scanner = new Scanner( System.in );

	String input = "";
	while ( !input.equals("Q") ){
	    System.out.println("Please enter a state" );
	    input = scanner.nextLine().toUpperCase();
	    if ( map.containsKey( input ) ){
		System.out.println(map.get( input ) );
	    } else {
		System.out.println("We did not recognize that state");
		
	     }
	}
    }
	

    
}
