package Assignment4;

public class testCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrepaidCard pr= new TravelCard();
		pr.rechargeCard(3000);
		System.out.println("Paise Ale!!");
		
		pr.toString();
		TravelCard tr=new TravelCard();
		tr.swipeCard(500);
		System.out.println("Paise Udale!!");
	    tr.toString();
		System.out.println("Maze Paise hatat urale="+pr.availableBalance);
		
		

	}

}
