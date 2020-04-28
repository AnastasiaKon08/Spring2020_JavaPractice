package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(8);

        list.add(1,6);
        System.out.println(list);
        list.set(3, 66);
        System.out.println(list);

        System.out.println("====================================");
        ArrayList <Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);

        Integer a= 1;
        list3.remove(a);
        System.out.println(list3);

        ArrayList <Integer> list4= new ArrayList<>();
        list4.add(10);
        list4.add(20);
        list4.add(30);
        Integer b = 20;
        boolean r1 = list4.remove(b);
        System.out.println(r1);
    }
}
