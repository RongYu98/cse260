public class TestMyInteger{

    public static void main(String args[]){
	MyInteger wannabe1 = new MyInteger(287638);

	System.out.println( "wannabe1 is "+wannabe1.getValue());
	System.out.println( "wannabe1 is odd: "+wannabe1.isOdd());
	System.out.println( "wannabe1 is even: "+wannabe1.isEven());
	System.out.println( "wannabe1 is prime: "+wannabe1.isPrime());

	int trueBe1 = 325;
	System.out.println( "trueBe1 is "+trueBe1);
	System.out.println( "wannabe1 is odd: "+MyInteger.isOdd(trueBe1));
	System.out.println( "wannabe1 is even: "+ MyInteger.isEven(trueBe1));
	System.out.println( "wannabe1 is prime: "+ MyInteger.isPrime(trueBe1));

	MyInteger wannabe2 = new MyInteger(287638);
	System.out.println( "wannabe2 is "+wannabe2.getValue());
	System.out.println( "wannabe1==wannabe2: "+wannabe1.equals(wannabe2));
	System.out.println( "wannabe1==12312: "+wannabe1.equals(12312));


	System.out.println("1234 is: "+MyInteger.parseInt("1234"));
	
    }




}
