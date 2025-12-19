package com.banking;

import com.banking.service.Account;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        
        // Example of transactions
        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);
        
        // output 
        account.printStatement();
    }
}
