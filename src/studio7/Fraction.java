package studio7;

public class Fraction {
	private int fenmu;
	private int fenzi;
	
	public Fraction(int initFenmu, int initFenzi) {
		fenmu=initFenmu;
		fenzi=initFenzi;
	}
	public String toString () {
		return fenzi+"/"+fenmu;
	}
	public Fraction multiply(Fraction other) {
		Fraction result = new Fraction(this.fenmu*other.fenmu, this.fenzi*other.fenzi);
		return result;
	}
	public Fraction add(Fraction other) {
		Fraction result = new Fraction(this.fenmu*other.fenmu, this.fenzi*other.fenmu+this.fenmu*other.fenzi);
		return result;
	}
	public Fraction reciprocal () {
		Fraction result = new Fraction(fenzi, fenmu);
		return result;
	}
	public Fraction simplify () {
		int max = 1;
		for (int i=1; i<=fenzi; i++) {
			if (fenzi%i==0&&fenmu%i==0) {
				max=i;
			}
			
		}
		Fraction result = new Fraction(fenmu/max, fenzi/max);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1=new Fraction(2,1);
		Fraction f2=new Fraction(12,4);
		System.out.println(f1.multiply(f2));
		System.out.println(f1.add(f2));
		System.out.println(f1.reciprocal());
		System.out.println(f2.simplify());

	}

}
