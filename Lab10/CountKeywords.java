import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.Arrays;

public class CountKeywords{

    // from online
    static final String keywords[] = { "abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "extends", "false",
                "final", "finally", "float", "for", "goto", "if", "implements",
                "import", "instanceof", "int", "interface", "long", "native",
                "new", "null", "package", "private", "protected", "public",
                "return", "short", "static", "strictfp", "super", "switch",
                "synchronized", "this", "throw", "throws", "transient", "true",
                "try", "void", "volatile", "while" };
    
    public static void main(String[] args){
	String fileName = args[0];

	List<String> kw = Arrays.asList(keywords);
	
	
	File file = new File(fileName);
	FileReader temp_reader = null;
	BufferedReader reader = null;
	try{
	    temp_reader = new FileReader( file );
	    reader = new BufferedReader( temp_reader );
	} catch( FileNotFoundException e ){}

	if ( reader == null ){
	    return;
	}

	String line = null;
	try{
	    line = reader.readLine();
	} catch ( Exception e ){}

	int count = 0;
	boolean slashy = false;
	boolean massComment = false;
	while ( line != null ){
	    
	    String[] words = line.split("\\s");
	    for ( String str : words ){
		if ( str.length() < 2 )
		    continue;
		if (str.substring(0,2).equals("//") )
		    slashy = true;
		if ( str.substring(0,2).equals("/*") )
		    massComment = true;
		if ( str.substring(0,2).equals("*/") && massComment )
		    massComment = false;
		if ( !massComment && !slashy && kw.contains(str) ){
		    count++;}
	    }
	    try{
		line = reader.readLine();
		
	    } catch( Exception e ){}
	}
	System.out.println( count );
    }


}
