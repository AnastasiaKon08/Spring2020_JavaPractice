package MyPractice2;

import b15_Inheritance.Student;

public class OnlineStudent extends Student {

    int webinarID;

    public OnlineStudent(String name, long studentID, int webinarID){
        super("Hanna", 780553); // calli8ng constructor from Super class. Compiler calls automatically
        this.name= name;
        this.studentID = studentID;
        this.webinarID = webinarID;

    }

    public void attendClassOnline(){
        System.out.println("Attending class online");
    }
}
