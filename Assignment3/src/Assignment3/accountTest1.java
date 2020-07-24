package Assignment3;


public class accountTest1 {
	int accnum=0;
	int balance=0;
	int deposit=0;
	int withdraw=0;
	
	
	
	public accountTest1() {
		this.accnum=this.accnum+1;
		System.out.println("Your account number is " + accnum);
		System.out.println("Your balance is " + balance);
	}
	public accountTest1(int balance) {
		this.balance=balance;
		this.accnum=this.accnum+1;
		System.out.println("Your account number is " + accnum);
		System.out.println("Your balance is " + balance);
	}
	
	void deposit(int deposit) {
		this.deposit=deposit;
		this.balance=this.balance+this.deposit;
		System.out.println("Now, your balance is " + balance);
	}
	
	void withdraw(int withdraw) {
		
	if(withdraw<balance) {
		this.withdraw=withdraw;
		this.balance=this.balance-this.withdraw;
		System.out.println("Now, your balance is " + balance);
	}
	else {
		System.out.println("You have insufficient balance ");
	}
}
	void deposit() {
		System.out.println("No amount deposited");
}
	void withdraw() {
		System.out.println("No amount withdrawn");
}
}

