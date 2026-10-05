class BankAccount {

    // Private variables for encapsulation
    private String accountNumber;
    private String customerName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Method to read the balance
    public double getBalance() {
        return balance;
    }

    // Method to update the balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: $" + balance);
    }
}


// Main class
class Main {

    public static void main(String[] args) {

        // Create a bank account
        BankAccount account1 = new BankAccount(
                "C6240368",
                "Hanan Ahmed",
                500.00
        );

        // Display account information
        System.out.println("===== BANK ACCOUNT =====");
        account1.displayAccountInfo();

        // Read current balance
        System.out.println("\nCurrent Balance: $" + account1.getBalance());

        // Update balance
        account1.setBalance(750.00);

        // Display updated balance
        System.out.println("Updated Balance: $" + account1.getBalance());
    }
}vv