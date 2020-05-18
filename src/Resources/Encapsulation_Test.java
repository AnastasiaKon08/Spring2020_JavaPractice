package Resources;

import day40_Encapsulation.Encapsulation;

public class Encapsulation_Test {

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();

        System.out.println(obj.getSsn());
        obj.setSsn(654321);
        System.out.println(obj.getSsn());
    }
}
