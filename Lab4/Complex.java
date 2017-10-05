public class Complex extends Number {
    
    private double a;
    private double b;

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
	str += ""+"+";
	str += b;
	str += "i)";
	return str;
	}

    public double doubleValue(){
	return Math.sqrt( a*a+b*b );
    }
    public float floatValue(){
	return (float)Math.sqrt( a*a+b*b );
    }
    public int intValue(){
	return (int)Math.sqrt( a*a+b*b );
    }
    public long longValue(){
	return (long)Math.sqrt( a*a+b*b );
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
    public Complex subtract( Complex other ){
	return new Complex( (other.getRealPart()-this.a)*-1, (other.getImaginaryPart()-b )*-1);
    }
    public Complex multiply( Complex other ){
	double newA = other.getRealPart()*this.a - other.getImaginaryPart()*this.b;
        double newB = other.getImaginaryPart()*a+other.getRealPart()*b;
	return new Complex(newA, newB );
    }
    public Complex divide( Complex other ){
	double newA = other.getRealPart()*this.a + other.getImaginaryPart()*this.b;
	newA /= other.getRealPart()*other.getRealPart()+other.getImaginaryPart()*other.getImaginaryPart();
	double newB = other.getImaginaryPart()*a+other.getRealPart()*b;
	newB /= other.getRealPart()*other.getRealPart()+other.getImaginaryPart()*other.getImaginaryPart();
	return new Complex(newA, newB );
    }


    
}

