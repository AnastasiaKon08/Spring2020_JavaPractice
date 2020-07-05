package MyPractice2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Alternate {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10, 11, 12));
        System.out.println("alternate(list1,list) = " + alternate(list1, list));


    }

    public static ArrayList alternate(List list1, List list) {
        ArrayList<Integer> alt = new ArrayList<>();
        Iterator<Integer> it1 = list1.iterator();
        Iterator<Integer> it = list.iterator();

        for (int i=0; i< list.size()+list1.size(); i++){
            while(it1.hasNext()){
                alt.add(it1.next());
                break;
            }

            while(it.hasNext()){
                alt.add(it.next());
                break;
            }
        }

        return alt;
    }

}
//  while(it.hasNext()){
//            if (it.next() < 4){
//                it.remove();