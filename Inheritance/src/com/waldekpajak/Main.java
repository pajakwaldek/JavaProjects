package com.waldekpajak;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 5, 5, 55);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long silky");
//        dog.eat();
        dog.walk();
//        dog.run();
        Fish fish = new Fish("Fish", 15, 2, 2,2,3);

    }
}