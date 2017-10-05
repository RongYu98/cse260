import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

public class AscendingOrder{


    public static void main(String[] args){
	// String[] words = new String[20];
	int count = 0;

	ArrayList<String> words = new ArrayList<String>();
	
	File filename = new File( args[0] );
	BufferedReader reader = null;
	try{
	    reader = new BufferedReader( new FileReader( filename ) );
	} catch ( FileNotFoundException e ){
	    System.out.println("No file found.");
	    System.exit(0);
	}

	//
	/*
	while ( word != null ){
	    if ( count >= words.length ){
		words = makeBigger( words );
	    }
	    for ( int i=0; i<count; i++ ){
		
	    }
	    word = br.nextLine();
	}
	*/
	try{
	    
	    String word = reader.readLine();
	    while ( word!= null ){
		words.add(word);
		word = reader.readLine();
	    }
	} catch( IOException e){
	}
	    Collections.sort(words);
	    System.out.println("Words: "+words);
	    
	
	try{
	    reader.close();
	} catch ( IOException e ){
	    System.exit(0);
	}
    }
}
