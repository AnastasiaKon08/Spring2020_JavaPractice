package day48_AbstractInterface;

abstract class T{
    // public default void method2(){}      // Can be created only in interface
        }
public interface DefaultMethod {

    default void method() {  // Can be created only in interface. Can be executed only in subclass
        System.out.println("default method");
    }

    class N implements DefaultMethod {
        public static void main(String[] args) {
            N obj = new N();

        obj.method();
        }

    }
}

