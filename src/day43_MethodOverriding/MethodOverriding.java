package day43_MethodOverriding;


class Test{
    public void method(){
    System.out.println("Mark");
        } }

public class MethodOverriding extends Test {

    public void method(){
        System.out.println("Zarina");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.method();

        MethodOverriding obj2 = new MethodOverriding();
        obj2.method();
    }

}
