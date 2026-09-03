public class Main {
	
	public static void main(String[] args) {
		BankAccount acc = new BankAccount();

		acc.deposit(100);

		System.out.println(acc.balance); //acc.getBalance();
	}
}	
