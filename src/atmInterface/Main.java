package atmInterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount userAccount = new BankAccount(1000);
		ATM atm=new ATM(userAccount);
		atm.start();
	}

}
