public class BankAccount {
    private double balance;        // hidden from outside

    public void deposit(double amount) {   // anyone can call this
        balance += amount;
    }

}
