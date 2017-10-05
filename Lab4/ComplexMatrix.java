public class ComplexMatrix extends GenericMatrix<Complex> {
    
    protected Complex add(Complex r1, Complex r2) {
	return r1.add(r2);
    }
	
    protected Complex multiply(Complex r1, Complex r2) {
	return r1.multiply(r2);
    }

    protected Complex zero() {
	return new Complex(0, 1);
    }


}
