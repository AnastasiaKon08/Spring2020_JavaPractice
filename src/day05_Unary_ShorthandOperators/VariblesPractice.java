package day05_Unary_ShorthandOperators;

public class VariblesPractice {

    public static void main(String[] args) {
        // whole numbers: byte, short, int, long
        // decimal: float, double
        int a1 = 100;
        float f1 = (long)a1;
        // f1 = 100l;
        // f1 = 100.0;

        System.out.println(f1);

        long l1 = (long)f1; // explicit
        // l1 = 100;
        System.out.println(l1);

        String name;
        name = "Cybertek";
        System.out.println(name);
    }
}
