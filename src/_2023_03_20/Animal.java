package _2023_03_20;

import java.util.ArrayList;
import java.util.List;

public class Animal extends Entity {
    public static void main(String[] args) {
        Entity dog = new Dog();
        Dog dog1 = new Dog();
        Flyable flyable = new Dog();
    }
}

class Dog extends Animal implements Flyable {

}

class Cat implements Flyable {
}

interface Flyable {

}

class Entity {

}