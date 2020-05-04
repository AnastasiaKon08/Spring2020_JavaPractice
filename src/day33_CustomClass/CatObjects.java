package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setCatInfo("Siberian", "Senia", "Grey-White", 12);
        System.out.println(cat1.toString());

        Cat cat2 =new Cat();
        cat2.setCatInfo("Domestic Short Hair", "Marusia", "tabby", 1);

        Cat cat3 = new Cat();
        cat3.setCatInfo("British", "Kuzia", "grey", 3);

        ArrayList<Cat> list = new ArrayList<>(Arrays.asList(cat1, cat2, cat3));
        for (Cat each: list){
            System.out.println(each.toString());
        }

        System.out.println("=======================");
        cat1.eat("fish");
        cat2.sleep();
        cat3.drink("milk");

    }
}
