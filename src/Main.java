
public class Main {
    public static void main(String[] args) {
        // Create a new bank account
        account account = new account(12345, "John Doe");

        // Deposit money and withdraw money
        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(600); // Attempt to withdraw more than the balance

        // Print transaction history and current balance
        account.printTransactionHistory();
        System.out.println("Current balance: " + account.getBalance());
    }
}
