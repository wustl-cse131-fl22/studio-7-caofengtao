package studio7;

public class Complex {
	private double real;
	private double imagine;
	public Complex (double initReal, double initImagine) {
		real = initReal;
		imagine =initImagine;
	}
	public String toString() {
		return real+"+"+imagine+"i";
	}
	public Complex add (Complex other) {
		Complex result = new Complex(this.real+other.real, this.imagine+other.imagine);
		return result;
	}
	public Complex multiply(Complex other) {
		Complex result = new Complex(this.real*other.real-this.imagine*other.imagine, this.real*other.imagine+this.imagine*other.real);
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1= new Complex (3,4);
		Complex c2= new Complex (5,6);
		System.out.println(c1.add(c2));
		System.out.println(c1.multiply(c2));

	}

}
