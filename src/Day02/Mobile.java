package Day02;

public class Mobile {
public static void main(String[] args) {
	
	Payment upi=new UPIPayment();
	upi.execute(1500);
	
	Payment card=new CreditCardPayment();
	card.execute(3500);
}
}
