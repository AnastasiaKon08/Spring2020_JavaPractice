package MyPractice2;

public class FoodObj {

    public static void main(String[] args) {
        Burger burger = new Burger("Spicy King", "medium");
        burger.eat();
        System.out.println(burger.toString());

        System.out.println("===================================");

        IcedCoffee coffee = new IcedCoffee("large");
        coffee.drink();
        System.out.println(coffee.toString());
    }
}
