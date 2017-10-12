import java.io.*;
import java.util.HashMap;
import java.util.Arrays;


public class Letters{

    static final char[] vowels = { 'A','E','I','O','U' };

    public static void main(String[] args){

	File file = new File( args[0] );
	FileReader temp_reader = null;
	BufferedReader reader = null;

	int consonantCount = 0;
	int vowelCount = 0;
	
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	map.put('A', 0);
	map.put('E', 0);
	map.put('I', 0);
	map.put('O', 0);
	map.put('U', 0);
	
	try{
	    temp_reader = new FileReader( file );
	    reader = new BufferedReader( temp_reader );
	} catch( FileNotFoundException e ){}

	if ( reader == null ){
	    return;
	}

	char car = '\u0000';
	int input = 0;
	try{
	    input = reader.read();
	} catch ( Exception e ){}

	while ( input != -1 ){
	    car = (char) input;
	    if ( map.containsKey( Character.toUpperCase(car) ) ){
		map.put( Character.toUpperCase(car), map.get( Character.toUpperCase(car))+1 );
		vowelCount++;
	    } else if ( Character.isLetter(car) ){
		consonantCount++;
	    }
		
	    try{
		input = reader.read();
	    } catch ( Exception e ){}
	}

	System.out.println("Consanants: "+consonantCount );
	System.out.println("Vowels: "+vowelCount ); // 

    }



}
