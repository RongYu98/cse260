public class MyInteger{
    /*

1. (MyInteger.java class) Implement a public class named MyInteger. The class contains:

- Methods equals(int) and equals(MyInteger) that return true if the value in the object is equal to the specified value.
- A static method parseInt(String) that converts a string to an int value. Implement the method without using Integer.parseInt(x).

     */

    private int value;

    public MyInteger( int num ){
	value = num;
    }

    public int getValue(){
	return value;
    }

    public boolean isEven(){
	return ( value%2 == 0 );
    }
    public boolean isOdd(){
	return ( value%2 == 1 );
    }
    public boolean isPrime(){
	for ( int i=1; i<value; i++ ){
	    if ( value%i==0 ){
		return false;
	    }
	}
	return true;
    }


    public static boolean isEven( int value ){
	return ( value%2 == 0 );
    }
    public static boolean isOdd( int value ){
	return ( value%2 == 1 );
    }
    public static boolean isPrime( int value ){
	for ( int i=1; i<value; i++ ){
	    if ( value%i==0 ){
		return false;
	    }
	}
	return true;
    }

    public boolean isEven( MyInteger other ){
	int value = other.getValue();
	return ( value%2 == 0 );
    }
    public boolean isOdd( MyInteger other ){
	int value = other.getValue();
	return ( value%2 == 1 );
    }
    public boolean isPrime(MyInteger other ){
	int value = other.getValue();
	for ( int i=1; i<value; i++ ){
	    if ( value%i==0 ){
		return false;
	    }
	}
	return true;
    }

    public boolean equals( int num ){
	return value==num;
    }
    public boolean equals( MyInteger other ){
	return other.getValue()==this.getValue();
    }

    public static int parseInt( String str ){
	int number=0;

	for ( int i=str.length()-1; i>=0; i-- ){
	    number += (str.charAt(i)-48)*Math.pow(10,str.length()-1-i);
	}
	return number;
    }

	
}
