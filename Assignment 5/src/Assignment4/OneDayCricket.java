package Assignment4;

    public class OneDayCricket extends cricket {
	int targetScore;
	int maxOvers=50;
	public  OneDayCricket() {

	}
	
	public double calcCurrentRunrate() {
		
		return this.getcurrentScore()/this.getcurrentOver();
		
	}
	
	
	public double calcReqdRunrate(int targetScore) {
		return	this.targetScore=targetScore;
 
		
	}
	
	public double calcReqdRunrate() {
		
return ((this.targetScore-this.getcurrentScore())/(this.maxOvers-this.getcurrentOver()));
		
	}

	
}
