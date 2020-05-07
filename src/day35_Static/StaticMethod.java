package day35_Static;

public class StaticMethod {

    int a=100; // instance variable
    static int b =200;

    public static void main(String[] args) {
        //  System.out.println(a); Static only accepts static
        StaticMethod obj = new StaticMethod();
        System.out.println(obj.a);

        System.out.println("====================");
        System.out.println(b);
        System.out.println(StaticMethod.b); // preferred to be called through the class name
        System.out.println(obj.b);

        System.out.println("====================");

    }
        public void method(){
            System.out.println(a);
            System.out.println(b);

    }
}
