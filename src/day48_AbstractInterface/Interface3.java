package day48_AbstractInterface;

public interface Interface3 {


    public void method1();

    public abstract void method2();

    static final int num = 100;
    int num2 = 300;

    public static void main(String[] args) {
        Interface3.method3();
        System.out.println(num2);
    }

    static void method3(){}

}
