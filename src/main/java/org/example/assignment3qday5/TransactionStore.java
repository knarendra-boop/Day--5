package org.example.assignment3qday5;



import java.util.ArrayList;
import java.util.List;

public class TransactionStore {

    private List<TransactionModel> transactions = new ArrayList<>();

    public void add(TransactionModel tx) {
        transactions.add(tx);
    }

    public List<TransactionModel> getAll() {
        return transactions;
    }
}
