package org.example.week1.oop;

class AnimalInheritance {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class DogInheritance extends AnimalInheritance {
    void bark() {
        System.out.println("This dog barks.");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        DogInheritance dogInheritance = new DogInheritance();
        dogInheritance.bark();
        dogInheritance.eat();
    }
}
