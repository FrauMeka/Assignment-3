class account {
    int accountnumber;
    String accountholder;
    double balance;
    amount[] transactions;
    int transactionCount;
    // new bank account
    public account(int accountnumber, String accountholder) {
        this.accountnumber = accountnumber;
        this.accountholder = accountholder;
        this.balance = 0.0; // Default balance is 0
        this.transactions = new amount[10]; // Fixed size array for transactions
        this.transactionCount = 0;
    }
    // deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            // new transaction
            transactions[transactionCount] = new amount(amount, TransactionType.DEPOSIT);
            transactionCount++;
            balance += amount;
            System.out.println("Successful deposit: " + amount);
        } else {
            System.out.println("Error!");
        }
    }
    // withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            // Create new transaction
            transactions[transactionCount] = new amount(amount, TransactionType.WITHDRAWAL);
            transactionCount++; // Increment the transaction count
            balance -= amount; // Update the balance
            System.out.println("Successful withdrawal: " + amount);
        } else {
            System.out.println("Error: Insufficient funds or invalid amount.");
        }
    }
    //history
    public void History() {
        if (transactionCount == 0) {
            System.out.println("No transactions.");
        } else {
            System.out.println("Transaction history:");
            for (int i = 0; i < transactionCount; i++) {
                System.out.println(transactions[i]);
            }
        }
    }

    //balance
    public double getBalance() {
        return balance;
    }
}