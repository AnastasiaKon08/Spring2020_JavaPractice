package day29_Wrapper_ArraysList;
import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {

        //ArrayList<DataType> name = new ArrayList<DataType>();
        ArrayList<Integer> scores = new ArrayList<Integer>(); // size is 0
        scores.add(10); //Autoboxing, size: 1
        scores.add(20);  //Autoboxing, size: 2
        scores.add(30);
        System.out.println(scores);

        Integer a2 = scores.get(2);
        double a3 = scores.get(1); // can be assigned to primitive  / unboxing
        System.out.println(a3);



    }
}
