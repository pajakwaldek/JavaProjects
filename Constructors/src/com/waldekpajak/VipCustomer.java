package com.waldekpajak;

public class VipCustomer {

    public String name;
    public double limit;
    public String emailAddress;

    public VipCustomer() {
        this("Default name", (double) 1000, "Default email");
        System.out.println("Empty constructor called ");
    }

    public VipCustomer(String name, double limit) {
        this(name, limit, "Default email");
    }

    public VipCustomer(String name, double limit, String emailAddress) {
        System.out.println("Account constructor with parameters was called");
        this.name = name;
        this.limit = limit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
