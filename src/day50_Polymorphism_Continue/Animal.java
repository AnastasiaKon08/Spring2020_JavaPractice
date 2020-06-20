package day50_Polymorphism_Continue;


public abstract class Animal {
    public int age;
    public String gender;

    public void eat(){
        System.out.println("Animal is eating");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    public static void methodA(){
        System.out.println("Animal");
    }
}

    class Cat extends Animal{
     public String catName;

     public Cat(String catName, String gender, int age){
         this.catName = catName;
         this.age = age;
         this.gender = gender;
     }

     public void sleep(){
         System.out.println("Cat " + catName + " is sleeping");
     }

     public void eat(){
         System.out.println("Cat " + catName + " is eating");
     }

     public final void scratch(){
         System.out.println(catName + " is scratching");
     }

    }

    final class Dog extends Animal{
    public String dogName;

    public Dog(String dogName, String gender, int age){
        this.dogName = dogName;
        this.age = age;
        this.gender = gender;
    }

    public void sleep(){
        System.out.println(dogName + " is sleeping");
    }

    public void eat(){
        System.out.println(dogName + " is eating");
    }

    public void bark(){
        System.out.println(dogName + " is barking");

    }

    public static void methodA(int a){
        System.out.println("Dog class A");
    }


}






