package JavaProject2;
import java.util.Scanner;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    // Main method to get user input and test the class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for account details
        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        // Create a new BankAccount object with user input
        BankAccount account = new BankAccount(accountHolderName, accountNumber, initialBalance);

        // Display the account details
        account.displayAccountDetails();

        // Perform deposit and withdrawal based on user input
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        // Display the updated account details
        account.displayAccountDetails();

        scanner.close();
    }
}
