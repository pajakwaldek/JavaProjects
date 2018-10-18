package com.waldekpajak;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", 14.55,"grain", "beef and sausage");
        super.addHamburgerAddition1("Chips", 3.66);
        super.addHamburgerAddition2("Drink", 2.33);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger.");
    }
}
