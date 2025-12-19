package com.banking.service;

import java.util.List;

import com.banking.exception.InsufficientBalanceException;
import com.banking.exception.InvalidAmountException;
import com.banking.model.Transaction;
import com.banking.util.Constants;

import java.util.ArrayList;

public class Account implements AccountService {

    private int balance;
    private List<Transaction> transactions;

    public Account() {
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    // To deposit an amount into the account
    @Override
    public void deposit(int amount) {
        validateAmount(amount, Constants.DEPOSIT_ERROR_MESSAGE);
        balance += amount;
        addTransaction(amount);
    }

    // To withdraw an amount from the account
    @Override
    public void withdraw(int amount) {
        validateAmount(amount, Constants.WITHDRAWAL_ERROR_MESSAGE);
        if (amount > balance) {
            throw new InsufficientBalanceException(Constants.INSUFFICIENT_BALANCE_ERROR_MESSAGE);
        }
        balance -= amount;
        addTransaction(-amount);
    }

    // To validate that the amount is positive
    private void validateAmount(int amount, String errorMessage) {
        if (amount <= 0) {
            throw new InvalidAmountException(errorMessage);
        }
    }

    // To record a transaction in the transaction history
    private void addTransaction(int amount) {
        transactions.add(new Transaction(new java.util.Date(), amount, balance));
    }

     // To print the account's transaction statement
    @Override
    public void printStatement() {
        System.out.println("Date       || Amount  || Balance");

        for (int i = transactions.size() - 1; i >= 0; i--) {
            Transaction transaction = transactions.get(i);
            System.out.printf("%tD  || %6d  || %6d\n", transaction.getDate(), transaction.getAmount(), transaction.getBalance());
        }
    }
}
