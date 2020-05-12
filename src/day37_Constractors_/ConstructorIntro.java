package day37_Constractors_;

public class ConstructorIntro {

    public ConstructorIntro( int a){ // Parameterized constructor
        // constructor creation
        System.out.println("Constructor with argument of int");
    }

    public static void main(String[] args) {

        ConstructorIntro obj = new ConstructorIntro(10);
        ConstructorIntro obj2 = new ConstructorIntro(10);
        ConstructorIntro obj3 = new ConstructorIntro(10);


    }
}
