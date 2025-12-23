package org.example.assignment3qday5;





import java.util.List;

    public class DigitalWalletApp{

        public static void main(String[] args) {

            System.out.println("=== DIGITAL WALLET APP ===");

            // Create wallet & user
            WalletModel wallet = new WalletModel(1000);
            UserModel user = new UserModel(1, "Narendra", wallet);

            // In-memory storage
            TransactionStore store = new TransactionStore();

            // Perform transactions
            store.add(new TransactionModel(1, 200, "CREDIT"));
            store.add(new TransactionModel(2, 100, "DEBIT"));
            store.add(new TransactionModel(3, 300, "CREDIT"));

            // Reports using Streams
            List<TransactionModel> all = store.getAll();
            List<TransactionModel> credits =
                    TransactionReport.onlyCredits(all);
            double total =
                    TransactionReport.totalAmount(all);

            // Output
            System.out.println("User Name: " + user.name);
            System.out.println("Wallet Balance: " + user.wallet.balance);
            System.out.println("Total Transactions: " + all.size());
            System.out.println("Credit Transactions: " + credits.size());
            System.out.println("Total Amount: " + total);
        }
    }


