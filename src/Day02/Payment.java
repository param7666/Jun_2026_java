package Day02;

import java.time.LocalDateTime;


public abstract class Payment {

	abstract void processPayment(double amount);
	
	final void execute(double amount) {
		processPayment(amount);
		logTransaction();
	}
	
	private void logTransaction() {
		System.out.println("Transaction logged at "+LocalDateTime.now());
	}
}
