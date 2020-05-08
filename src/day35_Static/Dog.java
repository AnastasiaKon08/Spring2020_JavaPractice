package day35_Static;

public class Dog {

     String breed;
     static boolean isPet;


    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.breed = "Husky";
        Dog.isPet =true;


        Dog dog2 = new Dog();
         dog2.breed = "German Shepard";
        System.out.println(dog1.breed);
        System.out.println(dog2.breed);

        System.out.println(dog1.isPet);
        System.out.println(dog2.isPet);


    }
}
