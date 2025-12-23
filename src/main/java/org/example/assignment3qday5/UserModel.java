package org.example.assignment3qday5;



public class UserModel {
    long id;
    String name;
    WalletModel wallet;

    public UserModel(long id, String name, WalletModel wallet) {
        this.id = id;
        this.name = name;
        this.wallet = wallet;
    }
}
