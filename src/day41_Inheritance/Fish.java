package day41_Inheritance;

public class Fish extends Animal {

    public void swim(){
        System.out.println(name + " is swimming");
    }

    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.name = "Nemo";
        fish.weight =5;
        fish.size = "small";

        fish.eat();
        fish.move();
    }
}
