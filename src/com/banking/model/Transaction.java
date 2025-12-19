package com.banking.model;

import java.util.Date;

public class Transaction {
    private Date date;
    private int amount;
    private int balance;

    public Transaction(Date date, int amount, int balance) {
        this.date = date;
        this.amount = amount;
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    public int getBalance() {
        return balance;
    }
}
