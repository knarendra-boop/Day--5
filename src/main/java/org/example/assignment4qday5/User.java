package org.example.assignment4qday5;



/**
 * Represents a wallet owner.
 */
public class User {
    private long id;
    private String name;
    private Wallet wallet;

    public User(long id, String name, Wallet wallet) {
        this.id = id;
        this.name = name;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public Wallet getWallet() {
        return wallet;
    }
}
