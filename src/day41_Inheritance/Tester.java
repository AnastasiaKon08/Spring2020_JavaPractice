package day41_Inheritance;

public class Tester extends Employee {


    public Tester(String name, double salary, int id, String jobTitle, char gender){
        this.name = name;
        this.gender  = gender;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
        public void reportingBug(){
            System.out.println(name + " is reporting a bug");
        }

        public void testing(){
            System.out.println(name + " is testing");
        }

}

/*
create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender
			actions: reportingBug, testing
			create a constructor that can initialize all the attributes of Tester
 */