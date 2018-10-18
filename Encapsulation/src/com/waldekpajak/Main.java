package com.waldekpajak;

public class Main {

    public static void main(String[] args) {
/*        Player player = new Player();
        player. = "Waldek";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaing health = " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaing health = " + player.healthRemaining());
    */

        EnhancedPlayer player = new EnhancedPlayer("Waldek", 2000, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}