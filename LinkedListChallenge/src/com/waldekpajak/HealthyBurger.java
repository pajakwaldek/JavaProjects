package com.waldekpajak;

public class HealthyBurger extends Hamburger {
    private String healthyExtraAdd1Name;
    private double healthyExtraAdd1Price;

    private String healthyExtraAdd2Name;
    private double healthyExtraAdd2Price;

    public HealthyBurger(double price, String meat) {
        super("Healthy", price, "brown", meat);
    }

    public void addHealthyExtraAdd1(String name, double price) {
        this.healthyExtraAdd1Name = name;
        this.healthyExtraAdd1Price = price;
    }

    public void addHealthyExtraAdd2(String name, double price) {
        this.healthyExtraAdd2Name = name;
        this.healthyExtraAdd2Price = price;
    }

    @Override
    public double itemsInHamburger() {
        double hamburgerPrice = super.itemsInHamburger();
        if (this.healthyExtraAdd1Name != null) {
            hamburgerPrice += this.healthyExtraAdd1Price;
            System.out.println("Added " + this.healthyExtraAdd1Name + "\n"
                    + "The price is: " + this.healthyExtraAdd1Price);
        }
        if (this.healthyExtraAdd2Name != null) {
            hamburgerPrice += this.healthyExtraAdd2Price;
            System.out.println("Added " + this.healthyExtraAdd2Name + "\n"
                    + "The price is: " + this.healthyExtraAdd2Price);
        }
        return hamburgerPrice;
    }
}
