package day42_Inheritance;

public class Employee extends Person {


    public double salary;
    public long id;
    public String jobTitle;


    public void setEmployeeInfo(String name, String jobTitle, double salary, long id){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;

    }


    public void work(){
        System.out.println(name + " is working");
    }

    public String toString(){
        return name+" Job Title: " + jobTitle+ ", salary: " + salary+
                "\nID: " + id;
    }

}
