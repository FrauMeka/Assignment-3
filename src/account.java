class account {
    int accountnumber;
    String accountholder;
    double balance;
    total[] transactions;
    int transactionCount;
    // new bank account
    public account(int accountnumber, String accountholder) {
        this.accountnumber = accountnumber;
        this.accountholder = accountholder;
        this.balance = 0.0; // Default balance is 0
        this.transactions = new total[10]; // Fixed size array for transactions
        this.transactionCount = 0;
    }
    // deposit money
    public void deposit(double total) {
        if (total > 0) {
            // new transaction
            transactions[transactionCount] = new total(total, TransactionType.DEPOSIT);
            transactionCount++;
            balance += total;
            System.out.println("Successful deposit: " + total);
        } else {
            System.out.println("Error!");
        }
    }
    // withdraw money
    public void withdraw(double total) {
        if (total > 0 && total <= balance) {
            // Create new transaction
            transactions[transactionCount] = new total(total, TransactionType.WITHDRAWAL);
            transactionCount++; // Increment the transaction count
            balance -= total; // Update the balance
            System.out.println("Successful withdrawal: " + total);
        } else {
            System.out.println("Error: Insufficient funds or invalid total.");
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