/**
* Java 1. Homework №5
* @author Александрова Мария
* @version 22.02.2022
*/


class HomeworkN5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Lunina I.A.", "Chief Spesialist", "luninaIA@yandex.ru", "8-965-123-35-64", 95000, 38);
        persArray[1] = new Person("Trusov S.A.", "Head of Sector", "trusovSA@yandex.ru", "8-966-155-35-61", 120000, 42);
        persArray[2] = new Person("Solovieva N.A.", "Engineer", "solovievaNA@yandex.ru", "8-905-723-55-84", 65000, 33);
        persArray[3] = new Person("Aleksandrov A.A.","Leading Specialist", "aleksandrovAA@yandex.ru", "8-925-125-25-30", 85000, 38);
        persArray[4] = new Person("Eliseev A.G.","Head of Department", "eliseevAG@yandex.ru", "8-966-173-25-77", 150000, 45);
        for (Person person : persArray) {
            if (person.displayAge() > 40) {
        System.out.println(person);
            }
        }
    }
}

class Person {
    private String name;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;
    
    Person(String name, String position, String email, String number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    int displayAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return name + ", " + position + ", " + email + " , " + number + ", " + salary + ", " + age;
    }
}