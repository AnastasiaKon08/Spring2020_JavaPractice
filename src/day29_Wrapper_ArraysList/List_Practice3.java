package day29_Wrapper_ArraysList;
import java.util.ArrayList;
public class List_Practice3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(20);
        list.add(300);
        list.add(400);
        list.add(50);
        System.out.println(max(list));
        System.out.println(min(list));
    }

        public static int max (ArrayList<Integer> list) {
            int maximum = Integer.MIN_VALUE;
            for (int each : list) {
                if (each > maximum) {
                    maximum = each;
                }
            }
            return maximum;
        }

        public static int min(ArrayList<Integer> list){
        int minimum = Integer.MAX_VALUE;
        for (int j =0; j< list.size(); j++){
            if (list.get(j)< minimum){
                minimum = list.get(j);
            }
        }
       return minimum;
    }
}
