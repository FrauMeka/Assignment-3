class total {
    double total; // total of the transaction
    TransactionType transactionType; // Type of transaction (deposit or withdrawal)
    /////
    // Constructor for the total class
    public total(double total, TransactionType transactionType) {
        this.total = total;
        this.transactionType = transactionType;
    }

    // Return a string with transaction information
    @Override
    public String toString() {
        return transactionType + " of total: " + total;
    }
}