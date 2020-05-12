package day38_Constructors;

import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {


        ArrayList<Item> list = new ArrayList<>();
        Item item1 = new Item("Oranges", 4.95, 2);
        Item item2 = new Item("Milk", 5.99, 1);
        Item item3 = new Item("Chicken", 4, 3);
        Item item4 = new Item("Coffee", 3.95, 3);
        Item item5 = new Item("Potatoes", 2.70, 5);

        list.add(item1); list.add(item2); list.add(item3); list.add(item4); list.add(item5);

        System.out.println(item2);

        double totalCost=0;
        for (Item each: list){
            totalCost+=each.calcCost();
        }
        System.out.println("The total cost of all items is " + totalCost);



    }
}