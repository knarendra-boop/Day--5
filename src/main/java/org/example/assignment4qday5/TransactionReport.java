package org.example.assignment4qday5;


import java.util.List;

/**
 * Generates reports using Streams API.
 */
public class TransactionReport {

    public static double totalAmount(List<Transaction> list) {
        return list.stream()
                .mapToDouble(Transaction::getAmount)
                .sum();
    }

    public static List<Transaction> onlyCredits(List<Transaction> list) {
        return list.stream()
                .filter(t -> t.getType().equals("CREDIT"))
                .toList();
    }
}
