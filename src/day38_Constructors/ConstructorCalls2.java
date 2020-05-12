package day38_Constructors;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
        System.out.println("Default Constructor");
    }

    public ConstructorCalls2(int a){
        this(); // Default Constructor
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls2(String str){
        this(10);
        System.out.println("Constructor with String argument");

    }

    public void method1(){

    }

    public static void main(String[] args) {
        ConstructorCalls2  obj1 = new ConstructorCalls2("Hello");

    }
}
