import java.util.Scanner;

public class TestComplex{


    public static void main(String args[]){
	double real1=0;
	double real2=0;
	double img1=0;
	double img2=0;

	Scanner sc = new Scanner( System.in );
	try{
	    System.out.println("Please enter real of the first complex number: ");
	    real1 = sc.nextDouble();
	    System.out.println("Please enter imaginary of first complex number: ");
	    img1 = sc.nextDouble();
	    
	    System.out.println("Please enter real of the second complex number: ");
	    real2 = sc.nextDouble();
	    System.out.println("Please enter img of the second complex number: ");
	    img2 = sc.nextDouble();
	    
	} catch (Exception e){
	    System.out.println("Something went wrong. Goodbye");
	    System.exit(0);
	}


	
	Complex c1 = new Complex( real1, img1 );
	System.out.println( c1.toString());
	Complex c2 = new Complex( real2, img2 );
	System.out.println( c2.toString());

	System.out.println("Adding the two numbers: "+c1.add(c2));
	System.out.println("Subtracting the two numbers: "+c1.sub(c2));
	System.out.println("Multiplying the two numbers: "+c1.mult(c2));
	System.out.println("Dividing the two numbers: "+c1.div(c2));
	
	
	//System.out.println(


    }

	
}
