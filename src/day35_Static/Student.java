package day35_Static;

public class Student {
    String name;
    int id;
    double gpa;
    static String SchoolName= "Cybertek";

    public void setInfo(String name, int id, double gpa){
        this.name= name;
        this.id = id;
        this.gpa = gpa;

    }

    public static void printSchool(){
        System.out.println("School name " + SchoolName);
    }

    public String toString(){
        return "Name: "+ name +", school name: " +SchoolName;
    }
}

