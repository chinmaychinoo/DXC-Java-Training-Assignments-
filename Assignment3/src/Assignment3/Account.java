package Assignment3;

public class Account {

	
	private int depositAmount=0;
	private int balance=100;
	
	public Account() {
		
	}
	public Account(int depositAmount) {
		this.depositAmount=depositAmount;
	}
	
	void depositamount() {
		
		if(balance>0) {
			System.out.println("Your account is active");
			this.balance=this.balance+this.depositAmount;
			System.out.println("Your balance is" + balance);
		}
		else {
			System.out.println("Sorry, your amount is not deposited because your account is inactive");
		}
		
}}


	
