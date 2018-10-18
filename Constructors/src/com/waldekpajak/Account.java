package com.waldekpajak;

public class Account {

    private String accountNumber;
    private double balance;
    public String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this("123123123123123123", 2.5, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called ");
    }

    public Account(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters was called");
        this.accountNumber = accountNumber;
//        setAccountNumber(accountNumber);
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String email, String phoneNumber) {
        this("999999999999999999999999", 100.55, customerName, email,phoneNumber);
        }

    public void deposit (double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if(balance - withdrawalAmount < 0) {
            System.out.println("Only " + balance + " available. Withdrawal not processed");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal " + withdrawalAmount + " processed. Remaining balance = " + balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



 /*
    public void setCustomerName(String customerName) {
        String validCustomerName = customerName.toLowerCase();
        if (validCustomerName.equals("Waldemar Pająk") || validCustomerName.equals("PVP")) {
            this.customerName = customerName;
        } else
            this.customerName = "Unknown";
    }

    public String getCustomerName{
        return this.customerName;
    }*/
}
