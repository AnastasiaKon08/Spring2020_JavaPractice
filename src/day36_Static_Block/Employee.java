package day36_Static_Block;

public class Employee {
    String name;
    int id;
    long ssn;
    String jobTitle;
    double salary;
    char gender;

   public void setEmployeeInfo(String name,  int id, long ssn, String jobTitle, double salary, char gender){
        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;

    }

    public String toString(){
        return "Employee name: "+ name+ ", gender " + gender +
                "\n Job Title " + jobTitle + ", id: " + id+
                "\n Salary: " + salary + ", ssn: " + ssn;

    }

    /*
    Task01:
	1. Create a class called Employee
			instance variables:
					name, id, ssn, jobTitle, salary, gender
			actions:
					setEmployeeInfo(): can initialize all the instance variables
					toString(): can return the info of the employee as string
     */
}
