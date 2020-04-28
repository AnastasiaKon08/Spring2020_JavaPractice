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
    }
}
