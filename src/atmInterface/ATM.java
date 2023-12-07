package atmInterface;

import java.util.Scanner;

public class ATM {

	private BankAccount account;
	private Scanner scanner;
	
	public ATM(BankAccount account) {
		this.account=account;
		scanner=new Scanner(System.in);
	}
	
	public void showMenu() {
		System.out.println("Wlcome to ATM");
		System.out.println("ATM Menu");
		System.out.println("1.Check Balance");
		System.out.println("2.Deposit Cash");
		System.out.println("3.Withdraw Cash");
		System.out.println("4.Exit");
	}
	
	public void start() {
		int choice;
		do {
			showMenu();
			System.out.println("Enter Your Choice");
			choice =scanner.nextInt();
		switch(choice) {
		case 1:
			checkBalance();
			break;
		case 2:
			deposit();
			break;
		case 3:
			withdraw();
			break;
		case 4:
			System.out.println("Exiting ATM. Thank You");
			break;
		default:
			System.out.println("Invalid choice please select a valid option");
		}
		}
		while(choice!=4);
	}
	private void checkBalance() {
		System.out.println("Current Balance:" + account.getBalance());
	
	}
	
	private void deposit() {
		System.out.println("Enter deposit amount: ");
		double amount= scanner.nextDouble();
		account.deposit(amount);
	}
	
	private void withdraw() {
		System.out.println("enter the withdrawl amount");
		double amount= scanner.nextDouble();
		account.withdraw(amount);
	}
}
