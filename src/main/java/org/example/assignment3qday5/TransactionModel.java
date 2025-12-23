package org.example.assignment3qday5;


public class TransactionModel {
    long id;
    double amount;
    String type; // CREDIT or DEBIT

    public TransactionModel(long id, double amount, String type) {
        this.id = id;
        this.amount = amount;
        this.type = type;
    }
}
