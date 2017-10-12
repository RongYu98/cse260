//import java.util.Comparable;
import java.io.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
public class CountOccurrenceOfWords implements Comparable<CountOccurrenceOfWords>{

    public String word;
    public int count;
    
    public CountOccurrenceOfWords( String word, int count ){
	this.word = word;
	this.count = count;
    }

    public int compareTo( CountOccurrenceOfWords other ){
	return this.count-other.count;
    }
    
    public static void main(String[] args){
	
	File file = new File( args[0] );
        FileReader temp_reader = null;
        BufferedReader reader = null;

	HashMap<String, Integer> map = new HashMap<String, Integer>();
	try{
            temp_reader = new FileReader( file );
            reader = new BufferedReader( temp_reader );
        } catch( FileNotFoundException e ){}

        if ( reader == null ){
            return;
        }

	String input = "";
	try{
	    input = reader.readLine();
	} catch( Exception e ){}
	while ( input!=null ){
	    String[] words = input.split("\\s+|\\?|,|.|;|:");
	    for ( int i=0; i<words.length; i++ ){
		String word = words[i].toUpperCase();
		if ( !map.containsKey( word ) ){
		    map.put( words[i], 1 );
		} else {
		    map.put( words[i], map.get(word)+1 );
		}
	    }
	    try{
		input = reader.readLine();
	    } catch( Exception e ){}
	}
	ArrayList<CountOccurrenceOfWords> list = new ArrayList<CountOccurrenceOfWords>();




	Set<String> mapSet = map.keySet();
	Iterator<String> it = mapSet.iterator();

	int num;
	while ( it.hasNext() ){
	    String name = it.next();
	    CountOccurrenceOfWords cw = new CountOccurrenceOfWords( name, map.get(name));
	    list.add(cw);
								    
	}

	Collections.sort(list);

       
	for ( CountOccurrenceOfWords c : list ){
	    System.out.println(c.count+" "+c.word);
	}
    }

}
