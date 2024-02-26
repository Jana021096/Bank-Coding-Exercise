public class Bank {
    private String name;
    private int balance;

    public Bank(String name) {
        this.name = name;
        this.balance = 0;
    }

    public boolean deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public int getBalance() {
        return balance;
    }
}
