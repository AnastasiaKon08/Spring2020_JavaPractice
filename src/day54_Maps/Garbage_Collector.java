package day54_Maps;

public class Garbage_Collector {

    public static void main(String[] args) {
       Garbage_Collector obj =  new Garbage_Collector(); // will not be collected by Garbage Collector

        new Garbage_Collector(); // will be collected by GC

        System.out.println("Done");

        String str = new String("Cybertek"); // created in Java Heap
        str = new String("MIT"); // "Cybertek" obj will be collected by GC

        System.out.println(str);

        Integer num = new Integer(123); // becomes unreferenced obj,
        num = new Integer(124);


        Double n = new Double(0.5);
        n = null;

        System.out.println(n);








    }

}
