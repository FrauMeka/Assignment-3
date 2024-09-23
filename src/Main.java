
public class Main {
    public static void main(String[] args) {
        // new bank account
        account account = new account(230141002, "Meerim Sarbalieva");

        // Deposit and withdraw
        account.deposit(1200);
        account.withdraw(400);
        account.withdraw(600);
        account.History();
        System.out.println("Current balance: " + account.getBalance());
    }
}
