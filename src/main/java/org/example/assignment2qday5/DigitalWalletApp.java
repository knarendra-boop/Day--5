package org.example.assignment2qday5;



import java.util.List;

public class DigitalWalletApp {

    public static void main(String[] args) {

        GenericRepository<WalletTxn> repo = new GenericRepository<>();

        // perform transactions
        repo.save(new WalletTxn(1, 200, new Credit()));
        repo.save(new WalletTxn(2, 100, new Debit()));
        repo.save(new WalletTxn(3, 300, new Credit()));
        repo.save(new WalletTxn(4, 150, new Transfer()));

        List<WalletTxn> allTxns = repo.findAll();

        // reports
        List<WalletTxn> creditTxns = TxnReport.onlyCredits(allTxns);
        double total = TxnReport.totalAmount(allTxns);

        // output
        System.out.println("All Transactions:");
        System.out.println(allTxns);

        System.out.println("\nCredit Transactions:");
        System.out.println(creditTxns);

        System.out.println("\nTotal Amount: " + total);
    }
}

