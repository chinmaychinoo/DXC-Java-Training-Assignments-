package Assignment3;

public class GiftCard {

	private long cardNo;
	private double balance=0;
	private boolean active;
	double amount;
	
	public GiftCard(long cardNo, double balance, boolean active) {
		this.active=active;
		this.balance=balance;
		this.cardNo=cardNo;
		}
	
	
	
	
	
	// Getter Setter Start
	


	public long getCardNo() {
		return cardNo;
	}


	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}


	public double getBalance() {
		return balance;
	}

	
	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}
	//Getter Setter End
	
	
	
	
	
	public GiftCard() {}
	
	
public void rechargeCard(double amount) {
	this.amount=amount;
	
	if(active==true) {
	this.balance=this.balance+this.amount;
	return;
	}
	else {
		System.out.println("Card is not activated" );
	}
		
	}




public void swipeCard(double amount) {
	this.amount=amount;
	
	if(active==true){
		
		if (this.balance>=amount) {
	this.balance=this.balance-this.amount;
	return;
	}
		
		else {System.out.println("Transaction unsuccessfull. Insufficient balance." );}
		
	}
	else {System.out.println("Transaction unsuccessfull. Card is not activated." );
		}
	}


}