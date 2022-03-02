/**
* Java 1. Homework №6
* @author Александрова Мария
* @version 27.02.2022
*/


class HomeworkN6 {
    public static void main(String[] args) {
        IAnimal[] animals = {
            new Cat("Fenix", "Cat", 200, 10),
            new Dog("Lucky", "Dog", 500, 10)
        };
        for (IAnimal animal : animals) {
            System.out.println(animal);
            animal.run(150);
            animal.swim(20);
        }
    }
}

class Cat extends Animal {
    Cat(String name, String type, int maxDistanceRun, int maxDistanceSwim) {
        super(name, type, maxDistanceRun, maxDistanceSwim);
    }
       
    @Override
    public void swim(int dist) {
        System.out.println("Cats don`t swim!");
    }
}

class Dog extends Animal {
    Dog(String name, String type, int maxDistanceRun, int maxDistanceSwim) {
        super(name, type, maxDistanceRun, maxDistanceSwim);
    }
}

interface IAnimal {
    void run(int length);
    void swim(int dist);
}


abstract class Animal implements IAnimal {
    protected String name;
    protected String type;
    protected int maxDistanceRun;
    protected int maxDistanceSwim;
    
    Animal(String name, String type, int maxDistanceRun, int maxDistanceSwim) {
        this.name = name;
        this.type = type;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceSwim = maxDistanceSwim;
    }
    
    public void run(int length) {
        if (maxDistanceRun >= length) {
            System.out.println(type + " " + name + " run " + length + " m.");
        } else {
            System.out.println(type + " " + name + " can`t run so far.");
        }
    }
    
    public void swim(int dist) {
        if (maxDistanceSwim >= dist) {
            System.out.println(type + " " + name + " swim " + dist + " m.");
        } else {
            System.out.println(type + " " + name + " can`t swim so far.");
        }
    }
    
    @Override
    public String toString() {
        return type + " " + name + " can run maximum " + maxDistanceRun + " m and swim " + maxDistanceSwim + " m.";
    }
}