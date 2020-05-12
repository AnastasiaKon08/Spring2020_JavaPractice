package day37_Constractors_;

public class Students {

    String name;
    int age;
    char gender;
    String university;

    public Students(String name, int age, char gender, String university){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university = university;
    }

    public void setInfo(String name, int age, char gender, String university){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university = university;

    }

    public String toString(){
        return "Name: "+name+" Age: "+age+" Gender: "+gender+" University: "+university;
    }

}
