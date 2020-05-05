package day30_ArrayList;

import java.util.ArrayList;

public class Arrays_Methods2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");


        boolean b1 =list.remove("A");
        System.out.println(b1);
        System.out.println(list);
    }
}
