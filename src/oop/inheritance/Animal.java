package oop.inheritance;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " says: Woof!");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        // метод, полученный от базового класса oop.inheritance.Animal
        dog.eat();
        // собственный метод класса oop.inheritance.Dog
        dog.bark();
    }
}
