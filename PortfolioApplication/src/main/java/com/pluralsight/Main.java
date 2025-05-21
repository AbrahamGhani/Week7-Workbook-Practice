package com.pluralsight;

import com.pluralsight.assets.*;
import com.pluralsight.banking.*;


public class Main {
    public static void main(String[] args) {

        // Create a portfolio for Abe
        Portfolio portfolio = new Portfolio("Abe's Portfolio", "Abe");

        // Create a bank account
        BankAccount bankAccount = new BankAccount("1234", "Abe", 3000.0);

        // Link a credit card to that bank account with initial debt
        CreditCard creditCard = new CreditCard(bankAccount, 1000.0); // Starts with $1000 debt

        // Perform credit card transactions
        creditCard.charge(500.0); // Debt: 1500, Bank balance: 2500
        creditCard.pay(300.0);    // Debt: 1200, Bank balance: 2800

        // Create some fixed assets
        Gold gold = new Gold("24K Gold", 65.0, 10);              // 10 oz * $65 = $650
        Jewelry jewelry = new Jewelry("Emerald Ring", 80.0, 18); // 80 * 18 = $1440
        Property house = new Property("Beach House", 150000, 2018, 2500, 4);   // Example house value logic

        // Add all valuables to the portfolio
        portfolio.addValuable(bankAccount);
        portfolio.addValuable(creditCard);
        portfolio.addValuable(gold);
        portfolio.addValuable(jewelry);
        portfolio.addValuable(house);

        // Output balances
        System.out.println("Bank Account Balance: $" + bankAccount.getBalance());
        System.out.println("Credit Card Debt: $" + -creditCard.getValue());

        // Output total value of portfolio
        System.out.println("Total Portfolio Value: $" + portfolio.getValue());

        // Output most and least valuable items
        Valuable mostValuable = portfolio.getMostValuable();
        Valuable leastValuable = portfolio.getLeastValuable();

        System.out.println("Most Valuable: " + mostValuable.getClass().getSimpleName() +
                " worth $" + mostValuable.getValue());

        System.out.println("Least Valuable: " + leastValuable.getClass().getSimpleName() +
                " worth $" + leastValuable.getValue());
    }
}