package day38_Constructors;

public class ConstructorPr {

    public ConstructorPr(){
        this(0.5); // constructor needs to be called first
        System.out.println("A");

    }

    public ConstructorPr(int a){
        System.out.println("B");
    }

    public ConstructorPr(double b){

        System.out.println("C");
    }
}
