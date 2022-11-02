package studio7;

public class HockeyPlayer {
	private String name;
	private int num;
	private boolean leftHand;
	private boolean leftShoot;
	private int goals;
	private int assists;
	private int points;
	private int games;
	
	public HockeyPlayer (String initName, int initNum, boolean initLeftHand, boolean initLeftShoot) {
		name = initName;
		num=initNum;
		leftHand=initLeftHand;
		leftShoot=initLeftShoot;
	}
	public void playGame(int goals, int assists) {
		points+=(goals+assists);
		this.goals+=goals;
		this.assists+=assists;
		games++;
	}
	
	

	@Override
	public String toString() {
		return "HockeyPlayer [name=" + name + ", num=" + num + ", leftHand=" + leftHand + ", leftShoot=" + leftShoot
				+ ", goals=" + goals + ", assists=" + assists + ", points=" + points + ", games=" + games + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HockeyPlayer h1 = new HockeyPlayer("a",11, false, false);
        h1.playGame(3, 4);
		System.out.println(h1);

	}

}
