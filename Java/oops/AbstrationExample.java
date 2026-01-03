package oops;
// abstract class
// Created using abstract keyword
// Can have abstract + non-abstract methods
// Cannot create object
// Supports constructors

abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Abstraction {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.eat();
    }
}
