package com.waldekpajak;

public class Contacts {
    private String contactName;
    private String mobileNumber;

    public String getContactName() {
        return contactName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public Contacts(String contactName, String mobileNumber) {
        this.contactName = contactName;
        this.mobileNumber = mobileNumber;
    }

    public static Contacts createContact(String contactName, String mobileNumber) {
        return new Contacts(contactName, mobileNumber);
    }
}
