package Assignment4;

interface Rewardable
{
   int reward(int amount);	
}
public class TravelCard extends PrepaidCard implements Rewardable {
	
	int rewardPoints;

	@Override
	public int reward(int amount) {
		// TODO Auto-generated method stub
		return 5*amount/100;
	}

	@Override
	public boolean swipeCard(int amount) 
	{ 
	if(amount<swipeLimit && amount<this.availableBalance) {
		
		this.availableBalance=(this.availableBalance*60)-(amount*60)-(0.05*amount*60);
		return true;
	}else {
		return false;
	}
	}

	@Override
	public String toString() {
		return "TravelCard [rewardPoints=" + rewardPoints + "]";
	}
		
	

}
	
