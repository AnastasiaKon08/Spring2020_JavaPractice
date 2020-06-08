package day48_AbstractInterface;

import day38_Constructors.SalaryCalculator;

public class PhoneObjects {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple", "X", 1000, "Max" );
        System.out.println(iphone.toString());

        iphone.texting(154377867);
        iphone.calling(785764557);

        System.out.println("=========================");

        Samsung samsung = new Samsung("Samsung", "S10", 1100, "+");
        System.out.println(samsung.toString());

        samsung.calling(8657343);
        samsung.texting(87586564);
    }
}
