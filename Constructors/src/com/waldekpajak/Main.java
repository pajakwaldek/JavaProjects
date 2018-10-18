package com.waldekpajak;

public class Main {

    public static void main(String[] args) {
        Account waldekAccount = new Account();

        waldekAccount.setAccountNumber("123456789456123456");
        waldekAccount.setBalance(1000);
        waldekAccount.setEmail("pajakwaldek@gmail.com");
        waldekAccount.setPhoneNumber("513 092 515");

        waldekAccount.withdrawal(100);
        waldekAccount.deposit(60);
        waldekAccount.withdrawal(100);
        waldekAccount.deposit(50);
        waldekAccount.withdrawal(100);
        System.out.println(" ");

//        Account waldekkAccount = new Account("12345678998765443152", 5000, "Waldek Pająk", "mailmail@gmail.com", "515 515 155");
        Account waldekkAccount = new Account();
        System.out.println(waldekkAccount.getAccountNumber());
        System.out.println(waldekkAccount.getBalance());
        waldekkAccount.withdrawal(100);
        waldekkAccount.deposit(60);
        waldekkAccount.withdrawal(100);
        waldekkAccount.deposit(50);
        waldekkAccount.withdrawal(100);
        System.out.println(" ");

        Account alaAccount = new Account("Ala", "alaala@gmail.com", "515515515");
        System.out.println("Account: " + alaAccount.getAccountNumber() + " belongs to: " + alaAccount.getCustomerName());
        System.out.println(" ");

        VipCustomer waldek1Account = new VipCustomer();
        System.out.println(waldek1Account.getName());
        System.out.println(waldek1Account.getLimit());
        System.out.println(waldek1Account.getEmailAddress());
        System.out.println(" ");
        VipCustomer waldek2Account = new VipCustomer("Waldek", 25000);
        System.out.println(waldek2Account.getName());
        System.out.println(waldek2Account.getLimit());
        System.out.println(waldek2Account.getEmailAddress());
        System.out.println(" ");
        VipCustomer waldek3Account = new VipCustomer("Alicja", 1500, "mail@mail.com");
        System.out.println(waldek3Account.getName());
        System.out.println(waldek3Account.getLimit());
        System.out.println(waldek3Account.getEmailAddress());
        System.out.println(" ");


    }
}
