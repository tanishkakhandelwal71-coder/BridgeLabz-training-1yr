import java.util.*;

public class BankingSystem {
    private Map<String, Double> accounts = new HashMap<>();

    public void addCustomer(String accNum, double initialBalance) {
        accounts.put(accNum, initialBalance);
    }

    public void deposit(String accNum, double amount) {
        accounts.put(accNum, accounts.getOrDefault(accNum, 0.0) + amount);
    }

    public void withdraw(String accNum, double amount) {
        double balance = accounts.getOrDefault(accNum, 0.0);
        if (amount > balance) {
            System.out.println("Error: Insufficient funds for " + accNum);
        } else {
            accounts.put(accNum, balance - amount);
        }
    }

    public void printReport() {
        System.out.println("\n--- Top 3 Customers ---");
        accounts.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .limit(3)
                .forEach(e -> System.out.println("Acc: " + e.getKey() + " | Balance: " + e.getValue()));
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        bank.addCustomer("ACC01", 5000);
        bank.addCustomer("ACC02", 1200);
        bank.addCustomer("ACC03", 8000);
        bank.addCustomer("ACC04", 3000);
        
        bank.withdraw("ACC01", 1000);
        bank.deposit("ACC02", 500);
        
        bank.printReport();
    }
}