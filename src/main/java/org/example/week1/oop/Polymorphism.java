package org.example.week1.oop;

class Animal {
    void sound() {  // overriding
        System.out.println("Some sound");
    }

    void sound(int count) {  // overloading
        System.out.println("Some sound " + count);
    }
}

class Dog extends Animal {
    private void secretMethod() {
        System.out.println("Data hiding");
    }

    @Override
    void sound() {
        secretMethod();
        System.out.println("Bark");
    }

    @Override
    void sound(int count) { // hint
        System.out.println("Dog " + count);
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }

    @Override
    void sound(int count) {
        System.out.println("Cat " + count);
    }
}

public class Polymorphism { // early/late binding
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.sound(5);

        Animal cat = new Cat();
        cat.sound();
        cat.sound(10);
    }
}
