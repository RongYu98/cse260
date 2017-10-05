public class Complex{

    /**

 methods add, subtract, multiply, and divide for performing complex number operations, and override toString method for returning a string representation for a 


complex number. The toString method returns "(a + bi)" as a string. If b is 0, it simply returns a. Provide three constructors Complex(a, b), Complex(a), and Complex(). Complex() creates a Complex object for number 0 and Complex(a) creates a Complex object with 0 for b.
     */

    double a;
    double b;

    public Complex(){
	this( 0, 0 );
    }
    public Complex( double real ){
	this( real, 0 );
    }
    public Complex( double real, double imaginary ){
	a = real;
	b = imaginary;
    }



    public String toString(){
	String str = "(";
	if ( b==0 ){
	    return str+a+")";
	}
	str += a;
	str += " "+"+ ";
	str += b;
	str += "i)";
	return str;
    }
    

    public double getRealPart(){
	return a;
    }
    public double getImaginaryPart(){
	return b;
    }

    public Complex add( Complex other ){
	return new Complex( other.getRealPart()+this.a, other.getImaginaryPart()+b );
    }
    public Complex sub( Complex other ){
	return new Complex( (other.getRealPart()-this.a)*-1, (other.getImaginaryPart()-b )*-1);
    }
    public Complex mult( Complex other ){
	double newA = other.getRealPart()*this.a - other.getImaginaryPart()*this.b;
        double newB = other.getImaginaryPart()*a+other.getRealPart()*b;
	return new Complex(newA, newB );
    }
    public Complex div( Complex other ){
	double newA = other.getRealPart()*this.a + other.getImaginaryPart()*this.b;
	newA /= other.getRealPart()*other.getRealPart()+other.getImaginaryPart()*other.getImaginaryPart();
	double newB = other.getImaginaryPart()*a+other.getRealPart()*b;
	newB /= other.getRealPart()*other.getRealPart()+other.getImaginaryPart()*other.getImaginaryPart();
	return new Complex(newA, newB );
    }
    

}
