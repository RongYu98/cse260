import java.util.List;
import java.util.ArrayList;

public class StringTrimmer{


    public static void trim( List<String> strList ){
	for ( int i=0; i<strList.size(); i++ ){
	    String str = strList.remove(i);
	    
	    while ( str.substring(0,1).equals(" ") ||
		    str.substring(str.length()-1,str.length()).equals(" ") ){
		if ( str.length() < 1 ){
		    return;
		}
		if ( str.substring(0,1).equals(" ") ){
		    str = str.substring(1, str.length());
		} else  if ( str.substring(str.length()-1,str.length()).equals(" ") ){
		    str = str.substring(0, str.length()-1);
		}
		System.out.println(str);
	    }
	    strList.add( i, str );
	}

    }

    public static void main(String[] args){
	List<String> list = new ArrayList<>();
	list.add("   hi  ");
	list.add("  testing");
	list.add("is    ");
	list.add("horr  ible  ");
	list.add(" I  ");
	

	trim( list );
	System.out.println( list );

    }



}
