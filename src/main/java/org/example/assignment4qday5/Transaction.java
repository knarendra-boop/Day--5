package org.example.assignment4qday5;



/**
 * Represents a wallet transaction.
 */
public class Transaction {
    private long id;
    private double amount;
    private String type; // CREDIT or DEBIT

    public Transaction(long id, double amount, String type) {
        this.id = id;
        this.amount = amount;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
}
