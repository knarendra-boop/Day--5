package org.example.assignment4qday5;



import java.util.List;

/**
 * Manual testing without JUnit.
 * Acts as a mini command-line application.
 */
public class ManualTestApp {

    public static void main(String[] args) {

        System.out.println("===== MANUAL TEST START =====");

        // Test Wallet & User
        Wallet wallet = new Wallet(1000);
        User user = new User(1, "Narendra", wallet);

        System.out.println("Wallet Balance Test → EXPECT 1000 | ACTUAL " + wallet.getBalance());
        System.out.println("User Name Test → EXPECT Narendra | ACTUAL " + user.getName());

        // Test Transactions
        TransactionStore store = new TransactionStore();
        store.add(new Transaction(1, 200, "CREDIT"));
        store.add(new Transaction(2, 100, "DEBIT"));
        store.add(new Transaction(3, 300, "CREDIT"));

        System.out.println("Transaction Count Test → EXPECT 3 | ACTUAL " + store.getAll().size());

        // Test Reports
        double total = TransactionReport.totalAmount(store.getAll());
        List<Transaction> credits = TransactionReport.onlyCredits(store.getAll());

        System.out.println("Total Amount Test → EXPECT 600 | ACTUAL " + total);
        System.out.println("Credit Count Test → EXPECT 2 | ACTUAL " + credits.size());

        System.out.println("===== MANUAL TEST END =====");
    }
}
