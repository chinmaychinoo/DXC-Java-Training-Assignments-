package Assignment3;

public class giftcardtest {
	public static void main(String[] args) {

		GiftCard dxc = new GiftCard(948611, 2000, true);

		dxc.rechargeCard(2000);
		dxc.swipeCard(400);
		dxc.swipeCard(500);

		System.out.println("Your Card number is " + dxc.getCardNo());
		System.out.println("Your balance is " + dxc.getBalance());

		GiftCard kratos = new GiftCard();

		kratos.setCardNo(123456);
		kratos.rechargeCard(3000);
		kratos.setActive(true);

		
		kratos.swipeCard(500);
		kratos.swipeCard(2600);

		System.out.println("Your Card number is " + kratos.getCardNo());
		System.out.println("Your balance is " + kratos.getBalance());

	}
}
