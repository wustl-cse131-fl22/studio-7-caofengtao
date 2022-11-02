package studio7;

public class Rectangle {
	private double width;
	private double length;
	
	public Rectangle (double initWidth, double initLength) {
		width = initWidth;
		length = initLength;
	}
	public double area () {
		return width*length;
	}
	public double perimeter () {
		return 2*(width+length);
	}
	public boolean compareArea (Rectangle other) {
		if (this.area()<other.area()) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isSquare () {
		return width==length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(4,4);
		Rectangle r2 = new Rectangle(3,4);
		System.out.println(r1.area());
		System.out.println(r2.area());
		System.out.println(r2.perimeter());
		System.out.println(r1.compareArea(r2));
		System.out.println(r2.isSquare());
		

	}

}
