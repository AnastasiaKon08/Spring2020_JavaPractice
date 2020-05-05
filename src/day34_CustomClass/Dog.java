package day34_CustomClass;

public class Dog {

    String breed;
    String size;
    int age;
    String color;
    String name;

    public void setDogInfo(String breed, String size, int age, String color, String name){
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.name = name;
        this.color = color;

        // this keyword is used for calling object instances
    }

    public String toString(){
        return "Dog name is "+name+
                " Breed "+ breed+
                ", "+ age + " years old"+
                ", " + color;
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name+ " is drinking "+ drink);
    }
    public void play(String toy){
        System.out.println(name+" is playing "+ toy);
    }

}
