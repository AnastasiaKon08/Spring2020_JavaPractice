package awesomeInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Maps {

    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<String,Integer>();//Creating HashMap
        map.put("Mango", 1);  //Put elements in Map
        map.put("Apple", 2);
        map.put("Banana", 3);
        map.put("Grapes", 4);
        System.out.println("minValue(map) = " + minValue(map));
    }

    public static Map uniqueCharacter(){
        String str = "accabbcd";
        Map<Character, Integer> unique = new HashMap<>();

        for( int j = 0; j < str.length(); j++) {
            int count =0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == str.charAt(j))
                    count++;
            }
            if( count == 1){
                unique.put(str.charAt(j), count);
            }
        }
        return unique;
    }

    public  static  int  minValue(HashMap<String, Integer> map  ) {

        SortedSet<Integer> sm = new TreeSet<>(map.values());

        return sm.first();

    }
}
