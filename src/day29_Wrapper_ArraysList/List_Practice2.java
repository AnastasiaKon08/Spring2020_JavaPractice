package day29_Wrapper_ArraysList;
import java.util.ArrayList;
public class List_Practice2 {

    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Coffee");
        shoppingList.add("Vegetable");
        shoppingList.add("Bread");
        System.out.println(shoppingList);

        for (int i = 0; i < 4; i++) {
            System.out.println(shoppingList.get(i));
        }

        System.out.println("===========================");

        for (String each : shoppingList) {
            System.out.println(each);
        }

        int size = shoppingList.size();
        System.out.println(size);

        int lastIndex = shoppingList.size() - 1;
        System.out.println(lastIndex);
    }
}
