import java.util.ArrayList;


public class Driver{

    
    public static void main(String[] args){

	ArrayList<Integer> numbers = new ArrayList<Integer>();
	for ( int i=0; i<20; i++ ){
	    numbers.add( (int)( Math.random()*50 ));
	}
       	System.out.println( "Random Numbers: "+numbers );
	SortArrayList.sort( numbers );
	System.out.println( "Sorted Random Numbers: "+numbers );
	System.out.println();
	System.out.println();


	numbers = new ArrayList<Integer>();
	for ( int i=0; i<20; i++ ){
	    numbers.add( (int)( Math.random()*50 ));
	}
       	System.out.println( "New Random Numbers: "+numbers );
	int max = LargestInArrayList.max( numbers );
	System.out.println( "Maximum of Random Numbers: "+max);
	System.out.println();


	System.out.println("Doing matrix stuff now");

	Complex[][] c1 = new Complex[][]{ { new Complex(1,1), new Complex(2,2) },
					  { new Complex(3,3), new Complex(4,4) }};
	Complex[][] c2 = new Complex[][]{ { new Complex(1,1), new Complex(2,2) },
					  { new Complex(3,3), new Complex(4,4) }};
	
	ComplexMatrix cm = new ComplexMatrix();
	
	System.out.println("\nm1 + m2 is ");
	cm.printResult( c1, c2, cm.addMatrix(c1, c2), '+');
	System.out.println("\nm1 * m2 is ");
	cm.printResult( c1, c2, cm.multiplyMatrix(c1, c2), '*');
	
    }

}
