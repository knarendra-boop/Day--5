package org.example.assignment4qday5;



import java.util.ArrayList;
import java.util.List;

/**
 * Stores transactions in memory.
 */
public class TransactionStore {

    private List<Transaction> transactions = new ArrayList<>();

    public void add(Transaction tx) {
        transactions.add(tx);
    }

    public List<Transaction> getAll() {
        return transactions;
    }
}
