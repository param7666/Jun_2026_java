package Day02;

public class UPIPayment extends Payment{

	@Override
	void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Proccessing payment via UPI "+amount);
	}
}
