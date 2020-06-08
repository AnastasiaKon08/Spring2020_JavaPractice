package day48_AbstractInterface;

public interface Interface2 {

    int a = 100;  // static and final by default

    public static void main(String[] args) {
        System.out.println(a);

        //  a = 200; - final variable by default, cannot be re-initialized

    }

        public default void method6(){
            System.out.println("Default method ");
        }



}
