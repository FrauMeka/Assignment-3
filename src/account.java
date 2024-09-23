class account {
    int accountNumber; // Account number
    String accountHolder; // Account holder's name
    double balance; // Current balance
    total[] transactions; // Array to store transactions
    int transactionCount; // Counter for the number of transactions

    // Constructor to create a new bank account
    public account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0; // Default balance is 0
        this.transactions = new total[10]; // Fixed size array for transactions
        this.transactionCount = 0; // Initialize transaction count
    }

    // Method to deposit money
    public void deposit(double total) {
        if (total > 0) {
            // Create a new transaction and add it to the array
            transactions[transactionCount] = new total(total, TransactionType.DEPOSIT);
            transactionCount++; // Increment the transaction count
            balance += total; // Update the balance
            System.out.println("Successful deposit: " + total);
        } else {
            System.out.println("Error: Deposit total must be greater than 0.");
        }
    }

    // Method to withdraw money
    public void withdraw(double total) {
        if (total > 0 && total <= balance) {
            // Create a new transaction and add it to the array
            transactions[transactionCount] = new total(total, TransactionType.WITHDRAWAL);
            transactionCount++; // Increment the transaction count
            balance -= total; // Update the balance
            System.out.println("Successful withdrawal: " + total);
        } else {
            System.out.println("Error: Insufficient funds or invalid total.");
        }
    }

    // Method to print transaction history
    public void printTransactionHistory() {
        if (transactionCount == 0) {
            System.out.println("No transactions.");
        } else {
            System.out.println("Transaction history:");
            for (int i = 0; i < transactionCount; i++) {
                System.out.println(transactions[i]);
            }
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}