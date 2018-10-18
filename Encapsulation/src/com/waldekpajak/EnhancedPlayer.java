package com.waldekpajak;

public class EnhancedPlayer {
    private String name;
    private int healthLevel = 100;
    private String weapon;

    public EnhancedPlayer(String name, int healthLevel, String weapon) {
        this.name = name;

        if(healthLevel > 0 && healthLevel <=100) {
            this.healthLevel = healthLevel;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.healthLevel -= damage;
        if(this.healthLevel <= 0) {
            System.out.println("Player is dead, Fatality !!!");
        }
    }

    public int getHealth() {
        return healthLevel;
    }

}
