package day41_Inheritance;

public class Employee {
    public String name;
    public double salary;
    public long id;
    public String jobTitle;
    public char gender;

    public String toString(){
        return "Employee name: " + name + ", Job Title: " +jobTitle+
                "\nSalary: $" + salary + ", id: " + id;
    }


}


/*
Task:
	creata  class called Employee:
			variables: salary, name, id, jobTitle, gender
			Actions: toString


     create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     		creata a constructor that can initialize all the attributes of businessAnalyst
 */