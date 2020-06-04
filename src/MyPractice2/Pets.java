package MyPractice2;

public abstract class Pets {

    String name;
    int age;
    String color;
    String breed;
    char gender;

    public abstract void sleep();

    public abstract void eat(String meal);


    public abstract void speak();

    public String toString() {
        return "name: " + name + " age: " + age +
                "\nbreead: " + breed + " color: " + color + " gender: " + gender;
    }
}

final class Dog extends Pets{

    public Dog(String name, int age, String color, String breed, char gender){
        this.name=name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
    }

    @Override
    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    @Override
    public void eat(String meal){
        System.out.println(name+ " is eating " + meal);
    }

    @Override
    public void speak(){
        System.out.println(name + " is barking");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Charle", 3, "spaniel", "brown", 'M');
        dog.eat("bone");
        dog.speak();
        dog.sleep();
        System.out.println(dog);
    }


}




    /*
    abstraction practice tasks:
    Task01:
            1. creaet an abstract class called Pets
            attributes: name, age, color, breed, gender
    methods:
    abstract methods: sleep, eat, speak
    instance method: toString
		2. create three sub classes (non-abstract) of pet:
            1. Dog
								2. Cat
								3. Tiger
    each class MUST have constructors to initialize the attributes

     */


