package day34_CustomClass;

import day33_CustomClass.Car;

import java.util.ArrayList;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(),new Carpet()};
        carpets[0].customOrder(7, 8.5, 20, true);
        System.out.println(carpets[0] );

        System.out.println("================================");

        carpets[1].customOrder(10, 25, 10, false);
        System.out.println(carpets[1]);


        carpets[3].customOrder(9, 20, 15, true);
        carpets[4].customOrder(20, 18, 25, false);

        System.out.println(carpets[3]);
        System.out.println("================================");
        System.out.println(carpets[4]);


        ArrayList<Carpet> persian = new ArrayList<>();
        ArrayList<Carpet> non_persian = new ArrayList<>();
        for (Carpet each: carpets){
            if (each.isPersian){
                persian.add(each);
            } else {
                non_persian.add(each);
            }
        }
        System.out.println("================================");
        System.out.println("There are "+ persian.size()+ " persian carpets");
        System.out.println("There are " + non_persian.size()+ " regular carpets");

        System.out.println(persian.get(1).calCost());

        }
}
