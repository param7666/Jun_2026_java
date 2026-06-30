package day03;

import java.time.LocalDate;
import java.time.LocalDateTime;

class BankAccount {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void deposite(double amount) {
		if (amount <= 0)
			throw new IllegalArgumentException("Invalid Amount");
		balance = balance += amount;
		System.out.println(
				amount + " Deposite successfull on" + LocalDateTime.now() + " Total balance is " + balance);
	}

	public void withdrow(double amount) {
		if (amount > balance)
			throw new IllegalArgumentException("Insufficient Balance..");
		if (amount <= 0)
			throw new IllegalArgumentException("Invalid Amount");
		balance = balance - amount;
		System.out.println(
				amount + " withdrow successfull on" + LocalDateTime.now() + " Remaining balance is " + balance);
	}

}

public class BankTest {

	public static void main(String[] args) {
		/*
		 * BankAccount sbi=new BankAccount(); sbi.balance=-999;
		 * System.out.println(sbi.balance);
		 */

		BankAccount sbi=new BankAccount();
		try {
			//sbi.deposite(-999);
			sbi.deposite(999);
			//sbi.withdrow(-999);
			sbi.withdrow(666);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
