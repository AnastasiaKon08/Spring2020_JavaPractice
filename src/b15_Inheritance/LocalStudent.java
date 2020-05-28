package b15_Inheritance;

public class LocalStudent extends Student{

    int seatID;

    public LocalStudent(){
        super("Frank", 456895); // compiler will not call super() constructor
        System.out.println("no arg from LocalStudent");
    }

    public LocalStudent(int seatID){
        this(); // once any other constructor is called, compiler will not insert super() in first line
        this.seatID = seatID;
        System.out.println("One arg constructor of LocalStudent");

    }
    public void attendClassInPerson(){
        System.out.println("Attending class on campus");
    }
}
