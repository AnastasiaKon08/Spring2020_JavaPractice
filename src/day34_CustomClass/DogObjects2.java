package day34_CustomClass;

import org.w3c.dom.ls.LSOutput;

public class DogObjects2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        String toy1 = "ball";
        String toy2 = "piano";

        dog1.setDogInfo("King Charles Spaniel", "small", 3, "brown", "Bailey");
        dog3.setDogInfo("Chihua Hua","Smal",1,"Brown","Tuzik");
        dog2.setDogInfo("Alabay", "Large", 5, "black", "Rain");

        dog2.eat("treats");
        dog1.drink("water");
        dog3.play(toy1);

        System.out.println("============================");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        Dog dog4 = new Dog();
        dog4.setDogInfo("Pomeranian", "Small", 3, "White", "Lil");

        System.out.println("============================");
        Dog[] dogPark = {dog1, dog2, dog3, dog4};
        for (Dog each: dogPark){
            each.eat("chicken");
        }

        for (int i=0; i<dogPark.length; i++){
            dogPark[i].play(toy1) ;
        }
    }
}
