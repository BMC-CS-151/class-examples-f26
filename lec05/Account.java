public class Account {
    private int balance;
    private boolean frozen;

    public Account(int initialBalance, boolean status) {
        balance = initialBalance;
        frozen = status;
    }

    //AccountException here
    private class AccountException extends Exception {
        public AccountException(String msg) {
            super(msg);
        }
    }

    private class AccountFrozen extends AccountException {
        public AccountFrozen(String msg) {
            super(msg);
        }
    }

    private class InsufficientFunds extends AccountException {
        public InsufficientFunds(String msg) {
            super(msg);
        }
    }

    public void withdraw(int amount) throws AccountException {
        if (this.frozen)  {
            throw new AccountFrozen("Cannot withdraw from a frozen account");
        }

        if (amount > this.balance) {
            throw new InsufficientFunds("Requested withdrawl amount is too large");
        }
        this.balance -= amount;
    }

}
