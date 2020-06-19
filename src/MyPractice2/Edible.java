package MyPractice2;

public interface Edible {

    void eat();
}

interface drinkable {
    void drink();
}

class Burger implements Edible{
    String name;
    String size;

   public Burger(String name, String size){
       this.name = name;
       this.size = size;
   }

   public String toString(){
       return name + " burger, size: " + size;
   }

    @Override
    public void eat() {
        System.out.println("Eating "+size + " " +  name + " burger");
    }
}

class IcedCoffee implements drinkable{
    String size;

    public IcedCoffee(String size){
        this.size = size;
    }

    public String toString(){
        return  size +" coffee";
    }

    public void drink(){
        System.out.println("Drinking iced-coffee");
    }
}






/*
Task01:
    1. create an interface named Edible
            abstract method: eat();
    2. create an interface named Drinkable that can inherit from Edible
            abstract method: drink();
    3. create an class named Burger that can inherit from Edible
            variables: name, size
            method: toString();
            create a constructor that can initialize instance variables
    4. create another class called IceCoffee  that can inherit from Drinkable
                variable: size
                method: toString()
            create constructor that can set the size
    fix any error might come up
 */