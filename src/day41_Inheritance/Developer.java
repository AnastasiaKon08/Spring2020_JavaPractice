package day41_Inheritance;

public class Developer extends Employee{

    public Developer(String name, double salary, int id, String jobTitle, char gender){
        this.name = name;
        this.gender  = gender;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void fixingBug(){
        System.out.println(name + " is fixing bug");
    }

    public void coding(){
        System.out.println(name + " is coding");
    }
}


/*
create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
	     creata a constructor that can initialize all the attributes of developer
 */