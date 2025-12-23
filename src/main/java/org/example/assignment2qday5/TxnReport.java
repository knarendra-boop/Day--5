package org.example.assignment2qday5;

import java.util.List;

public class TxnReport {

    // only CREDIT transactions
    static List<WalletTxn> onlyCredits(List<WalletTxn> txns) {
        return txns.stream()
                .filter(t -> t.type() instanceof Credit)
                .toList();
    }

    // total amount of all transactions
    static double totalAmount(List<WalletTxn> txns) {
        return txns.stream()
                .mapToDouble(WalletTxn::amount)
                .sum();
    }
}