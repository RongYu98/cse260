import java.util.Scanner;
import java.util.ArrayList;


public class GenericStackExtendsArrayList<E> extends ArrayList<E>{
    // gottten from class work and then revised.

    public int getSize() {
	return super.size();
    }
    public E peek() {
	return super.get(getSize() - 1);
    }
    public void push(E o) {
	super.add(o);
    }
    public E pop() {
	E o = super.remove(getSize() - 1);
	return o;
    }
    public boolean isEmpty() {
	return super.isEmpty();
    }
    @Override // Java annotation: also used at compile time to
    public String toString() { // detect override errors
	String all = "["+super.get( getSize()-1 );
	for ( int i = getSize()-2; i>=0 ; i-- ){
	    all += ", "+super.get(i);
	}
	all+="]";
	return "stack: " + all;
    }



    public static void main(String[] args){
	GenericStackExtendsArrayList<String> GS = new GenericStackExtendsArrayList<String>();
	Scanner input = new Scanner( System.in );
	for ( int i=0; i<5; i++ ){
	    //System.out.println("Please enter a string: ");
	    //String str = input.nextLine();
	    //GS.push( str );
	}
	//System.out.println( GS );
	//System.out.println("Popping: "+GS.pop() );


	String[] strArr = new String[GS.getSize()];
	for ( int i=0; i<GS.size(); i++){
	    //strArr[i] = GS.get(GS.size()-1-i);
	}

	int[] nums = new int[100];
	for ( int i=0; i<100; i++ ){
	    nums[i] = i;
	}
	System.out.println("BinarySearch 3: "+BinarySearch.binarySearch( nums, 3));
	System.out.println("BinarySearch of 11: "+BinarySearch.binarySearch( nums, 11));
	System.out.println("BinarySearch of 15: "+BinarySearch.binarySearch( nums, 15));
	System.out.println("BinarySearch of 86: "+BinarySearch.binarySearch( nums, 86));
	//	System.out.println(BinarySearch.binarySearch(nums,"1"));
	//System.out.println(BinarySearch.binarySearch(nums,"2"));
	//System.out.println(BinarySearch.binarySearch(nums,"4"));
      	//System.out.println(BinarySearch.binarySearch(nums,"5"));
	
    }
	    
	
}
