package com.pluralsight.banking;

import com.pluralsight.Valuable;
public class CreditCard implements Valuable {
    private BankAccount linkedAccount;
    private double debt;

    public CreditCard(BankAccount linkedAccount, double initialDebt) {
        this.linkedAccount = linkedAccount;
        this.debt = initialDebt;
    }

    public void charge(double amount) {
        if (amount > 0) {
            debt += amount;
            linkedAccount.withdraw(amount); // reduces real account balance
        }
    }

    public void pay(double amount) {
        if (amount > 0) {
            debt -= amount;
            linkedAccount.deposit(amount); // replenishes account
        }
    }

    @Override
    public double getValue() {
        return -debt; // still reflects the negative value for net worth
    }

    public String getName() {
        return linkedAccount.getName();
    }

    public String getAccountNumber() {
        return linkedAccount.getAccountNumber();
    }
}