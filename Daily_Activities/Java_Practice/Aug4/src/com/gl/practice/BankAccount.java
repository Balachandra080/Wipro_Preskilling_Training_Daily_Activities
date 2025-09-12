package com.gl.practice;

public class BankAccount 
{
    private String accountName;
    private String accountNumber;
    private String accountType;
    private double balance;

    public BankAccount(String accountName, String accountNumber, String accountType, double balance) 
    {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String toString() 
    {
        return "Account Name: " + accountName + "\n" +
               "Account Number: " + accountNumber + "\n" +
               "Account Type: " + accountType + "\n" +
               "Balance: " + balance + "\n";
    }
}
