package day50_Polymorphism_Continue;

public class AnimalObj {
    public static void main(String[] args) {

        Dog obj1 = new Dog("Bailey", "male", 5);
        obj1.bark();
        System.out.println(obj1.dogName);

        Animal obj = new Dog("Lucy", "female", 4);
        // System.out.println(obj.dogName);
        // obj.bark();
        obj.eat();
        obj.methodA();
        obj1.methodA(10);


        Animal animal1 = new Cat("Kuza", "M", 2);
        boolean isCat = animal1 instanceof Cat;
        System.out.println(isCat);

        Dog d1 = new Dog("A", "g", 3);
       // boolean r1 d1 instanceof Cat; No IS A relation between Cat and Dog



    }
}
