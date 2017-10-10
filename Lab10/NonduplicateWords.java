import java.io.*;
import java.util.TreeSet;

public class NonduplicateWords{

    public static void main(String[] args){
	String fileName = args[0];
	
	File file = new File(fileName);
	BufferedReader reader = null;
	FileReader temp_reader = null;
	try{
	    temp_reader = new FileReader( file );
	    reader = new BufferedReader( temp_reader );
	} catch( FileNotFoundException e ){}

	if ( reader == null ){
	    return;
	}
	TreeSet<String> ts = new TreeSet<String>();
	String line = null;
	try{
	    line = reader.readLine();
	} catch ( Exception e ){}
	while ( line != null ){
	    String[] words = line.split("\\s");
	    for ( String str : words ){
		/* 
		if ( ts.ceiling( str ) != null &&
		     ts.ceiling( str ).equals( str ) ) // meaning it has
		     ts.add( str ); public static public int 
		*/
		ts.add(str);
	    }
	    try{
		line = reader.readLine();
	    } catch( Exception e ){}
	}
	System.out.println( ts );
    }

}
