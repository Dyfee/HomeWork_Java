/**
* Java 1. Homework №7
* @author Александрова Мария
* @version 03.03.2022
*/


class HomeworkN7 {
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat("Fenix", 10),
            new Cat("Murka", 10),
            new Cat("Barsik", 20)
        };
        
        Plate plate = new Plate(30);
        System.out.println(plate);
        
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        
        System.out.println("Increase food by 30");
        plate.addFood(30);
        System.out.println(plate);
        
        for (Cat cat : cats) {
            cat.setFullness(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean fullness;
    
    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }
    
    void eat(Plate p) {
        if (p.getFood() >= appetite) {
        p.decreaseFood(appetite);
        fullness = true;
        }
    }
    
    void setFullness(boolean fullness) {
        this.fullness = fullness;
    }
    
    @Override
    public String toString() {
        return "Cat: " + name + ", appetite: " + appetite + ", fullness: " + fullness;
    }
}

class Plate {
    private int food;
    
    Plate(int food) {
        this.food = food;
    }
    
    void decreaseFood(int food) {
        this.food -= food;
    }
    
    int getFood() {
        return food;
    }
    
    void addFood(int food) {
        this.food += food;
    }
    
    @Override
    public String toString() {
        return "Plate: " + food;
    }
}