// Base class
public class BankAccount {
    public String accountNumber;        
    protected String accountHolder;    
    private double balance;            


    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        if (amount >= 0) {
            this.balance = amount;
        } else {
            System.out.println("Invalid balance. It cannot be negative.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber
                         + ", Account Holder: " + accountHolder
                         + ", Balance: $" + getBalance());
    }
}
