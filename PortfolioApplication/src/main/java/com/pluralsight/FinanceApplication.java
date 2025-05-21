package com.pluralsight;

import com.pluralsight.banking.BankAccount;

public class FinanceApplication {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123", "Pam", 12500);
        Valuable account2 = new BankAccount("456", "Gary", 1500);

        account1.deposit(100);   // ✅ Works: declared as BankAccount
        // account2.deposit(100); // ERROR: only sees methods from Valuable

        System.out.println("Account1 balance: " + account1.getValue());
        System.out.println("Account2 value: " + account2.getValue());
    }

}
