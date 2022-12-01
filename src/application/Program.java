package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
			
		
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			System.out.print("Initial Balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawAmount = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawAmount);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double withdraw = sc.nextDouble();
			
			
			try {
				account.withdraw(withdraw);
				System.out.printf("New balance: %.2f%n", account.getBalance());
				
			} catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
