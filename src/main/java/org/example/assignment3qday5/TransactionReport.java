package org.example.assignment3qday5;



import java.util.List;

public class TransactionReport {

    public static double totalAmount(List<TransactionModel> list) {
        return list.stream()
                .mapToDouble(t -> t.amount)
                .sum();
    }

    public static List<TransactionModel> onlyCredits(List<TransactionModel> list) {
        return list.stream()
                .filter(t -> t.type.equals("CREDIT"))
                .toList();
    }
}

