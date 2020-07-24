package Assignment4;

public abstract class cricket {

	private int maxOvers; 
	private int targetScore;
	private int currentOver; 
	private int currentScore;
	
	
	
	public int getMaxOvers() {
		return maxOvers;
	}
	
	public int getTargetScore() {
		return targetScore;
	}

	public int getcurrentOver() {
		return currentOver;
	}
	public void setcurrentOver(int currentOver) {
		this.currentOver = currentOver;
	}
	public int getcurrentScore() {
		return currentScore;
	}
	public void setcurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	
	
	public cricket() {
		
		
	}
	
	public  cricket(int targetScore) {
		
		this.targetScore=targetScore;
	}
	
	
	
public abstract double calcCurrentRunrate();

public abstract double calcReqdRunrate();



}

	
