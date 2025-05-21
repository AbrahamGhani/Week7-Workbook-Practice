package com.pluralsight.banking;

import com.pluralsight.Valuable;

public class BankAccount implements Valuable {

    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }

    @Override
    public double getValue() {
        return balance;
    }

}
