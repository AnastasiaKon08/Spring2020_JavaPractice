package b15_Inheritance;

public class Student { 
   protected String name;
   protected long studentID;

    public Student(){
        System.out.println("no arg from Student");
    }

    public Student(String name, long studentID){
        //super();
        // this(); - calling default constructor
        this.studentID = studentID;
        this.name = name;
        System.out.println(this.name + " "+ this.studentID);
    }


    public void study(){
        System.out.println(name + " is studying");
    }

    public String printDetail(){
        return "Name: " + name +", student id: " +studentID;
    }

}
