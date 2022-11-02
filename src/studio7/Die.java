package studio7;

public class Die {
	private int num;
	
	public Die (int initNum) {
		num = initNum;
	}
	public int rollDice() {
		return (int)(Math.random()*num+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die d1 = new Die (6);
		System.out.println(d1.rollDice());

	}

}
