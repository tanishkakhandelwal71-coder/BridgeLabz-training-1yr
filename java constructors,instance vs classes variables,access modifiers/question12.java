
public class Question12 {
    public static void main(String[] args) {
        // Question 12: Bank Account Management
        SavingsAccount savings = new SavingsAccount("Alice", "SA123", 5000);
        savings.showInfo();
    }
}

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountHolder, String accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    public void showInfo() {
        // Accessing public and protected
        System.out.println("Savings Account: " + accountNumber + ", Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance()); // Private access via getter
    }
}