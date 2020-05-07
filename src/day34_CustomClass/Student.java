package day34_CustomClass;

public class Student {
    String name;
    String nationality;
    int age;
    double gpa;
    char gender;
    boolean isMarried;

    public void setStudentInfo(String name, String nationality, int age, double gpa, char gender, boolean isMarried){
        this.name = name;
        this.nationality = nationality;
        this.age =age;
        this.gpa = gpa;
        this.gender= gender;
        this.isMarried = isMarried;
    }

    public String toString(){
        return "Student info: \nName: "+name+
                "\nAge "+ age + ", gender "+ gender+
                "\nNationality "+ nationality+
                "\nmartial status: "+ isMarried;

    }
}
