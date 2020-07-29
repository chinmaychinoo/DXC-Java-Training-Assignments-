package Assignment4;

public abstract class PrepaidCard {
	int CardNo;
	double availableBalance;
	double swipeLimit;

	public abstract boolean swipeCard(int amount);

	public void rechargeCard(int amount) {
		
		 availableBalance = availableBalance+ amount   ;
	}

	@Override
	public String toString() {
		String str="PrepaidCard [CardNo=" + CardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
				+ "]";
		System.out.println(str);
		return str;
				
	}
	
}