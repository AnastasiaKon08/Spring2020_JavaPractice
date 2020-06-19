package day49_Polymorphism_Inro;


class Animal{

}

class Dog  extends Animal{ // IS A relation

}

class Cat extends Animal{

}

public class Polymorphism {
    public static void main(String[] args) {
        Animal obj  = new Animal();
        Animal obj1 = new Dog(); //polymorphism
        Animal obj2 = new Cat();

        Animal[] animalShow = {obj, obj1, obj2};


    }

}
