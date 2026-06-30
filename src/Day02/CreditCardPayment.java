package Day02;

public class CreditCardPayment extends Payment{

@Override
	void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Proccessing Credit Card Payment :: "+amount);
	}	

}
