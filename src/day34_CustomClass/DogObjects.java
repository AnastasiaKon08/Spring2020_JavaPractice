package day34_CustomClass;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setDogInfo("Husky", "small", 4, "black-white", "Ghost");
        Dog dog2 = new Dog();
        dog2.setDogInfo("Alabay", "Extra big", 5, "Brown", "Ajdar");
        Dog dog3 = new Dog();
        dog3.setDogInfo("Poodle","Miniature",2,"White","Lucy");
        Dog dog4 = new Dog();
        dog4.setDogInfo("Pomeranian", "Small", 3, "White", "Lil");
        Dog dog5 = new Dog();
        dog5.setDogInfo("pomeranian", "Small",4, "White", "Ernie");


        System.out.println("==========================");

        ArrayList<Dog> puppies = new ArrayList<>(Arrays.asList(dog1, dog2, dog3));
        puppies.addAll(Arrays.asList(dog4, dog5));
        for (int i=0; i<puppies.size(); i++){
            System.out.println(puppies.get(i));
        }

        System.out.println("=====================================");

        puppies.removeIf( p -> p.age > 2);

        for(int i = 0; i < puppies.size(); i++ ){
            Dog eachdog  = puppies.get(i);
            System.out.println( eachdog );
        }




    }
}
