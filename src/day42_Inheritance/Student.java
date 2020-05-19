package day42_Inheritance;

public class Student extends Person{

    public long studentID;
    public String clazz;


    public void setStudentInfo(String name, char gender, String clazz, long studentID){
        this.name= name;
        this.clazz=clazz;
        this.studentID=studentID;
    }

    public String toString(){
        return name + ", Class: " + clazz +", ID: " + studentID
                +"\n gender: " + gender;
    }

}
