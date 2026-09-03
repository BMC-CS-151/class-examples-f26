public class BankAccount {
    private double balance;        // hidden from outside

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {   // anyone can call this
        balance += amount;
    }

}
