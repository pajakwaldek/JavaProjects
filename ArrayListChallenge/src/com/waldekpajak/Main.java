package com.waldekpajak;

import java.util.Scanner;

public class Main {

    // Create a program that implements a simple mobile phone with the following capabilities.
    // Able to store, modify, remove and query contact names.
    // You will want to create a separate class for Contacts (name and phone number).
    // Create a master class (MobilePhone) that holds the ArrayList of Contacts
    // The MobilePhone class has the functionality listed above.
    // Add a menu of options that are available.
    // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
    // and search/find contact.
    // When adding or updating be sure to check if the contact already exists (use name)
    // Be sure not to expose the inner workings of the Arraylist to MobilePhone
    // e.g. no ints, no .get(i) etc
    // MobilePhone should do everything with Contact objects only.

    private static Scanner scanner = new Scanner(System.in);
    // private static MobilePhone mobilePhone = new MobilePhone;

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        chooseFunctions();
        while(!quit) {
            System.out.println("Choose functionality: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    chooseFunctions();
                    break;
                case 1:
                    printContactsList();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;

            }
        }
    }

    public static void chooseFunctions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice of functionality.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add contact to contact's list.");
        System.out.println("\t 3 - To modify an existed contact on contact's list.");
        System.out.println("\t 4 - To remove contact to contact's list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To copy array.");
        System.out.println("\t 7 - To quit the application.");
    }

    public static void printContactsList() {

    }

    public static void addNewContact() {

    }

    public static void updateContact() {

    }

    public static void removeContact() {

    }

    public static void findContact() {

    }

    public static void processArrayList() {

    }

}
