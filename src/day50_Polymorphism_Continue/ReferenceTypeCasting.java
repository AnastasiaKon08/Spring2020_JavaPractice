package day50_Polymorphism_Continue;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        int a = 100;
        double b = a; // implicit casting

        Dog dog = new Dog("h", "g", 5);
        Animal animal1 = (Animal) dog; // upcasting, done automatically

        Cat cat = new Cat("L", "k", 7);
        //Dog dog2 = cat; no IS A relation
        Animal animal2 = (Animal) cat;

        System.out.println("==========================");

        double c = 10;
        int d = (int)c; // explicit casting, done manually

        Animal animal3 = new Dog("h", "p", 8);
        Dog dog3 = (Dog) animal3;

        Animal animal4 = new Cat("h", "n", 4);
        Cat cat3 = (Cat) animal4;

        System.out.println("============================");
        Animal animal5 = new Dog("h", "g", 5);
        // animal5.bark();
        Dog dog5 = (Dog) animal5; // downcasting
        dog5.bark();

        // second way:
        ( (Dog)animal5 ).bark(); // downcasting






    }
}
