package day54_Maps;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Map_SetEntries {
    public static void main(String[] args) {
        LinkedHashMap<String, String> fb = new LinkedHashMap<>();
        fb.put("Tester1", "test");
        fb.put("Tester2", "test");
        fb.put("Tester3", "password1");
        fb.put("Tester4", "password2");
        fb.put("Tester5", "password2");
        fb.put("Tester5", "password3");

        System.out.println(fb.size());

        System.out.println("================================");

       for (String each : fb.keySet()){
           System.out.println(each);
       }

       List<String> usernames = new ArrayList<>(fb.keySet());
        System.out.println(usernames);

        System.out.println("================================");

       for (String eachValue : fb.values()){
           System.out.println(eachValue);
       }

       List<String> passwords = new ArrayList<>(fb.values());
        System.out.println(passwords);


        System.out.println("===============================");

        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Adil",92);
        students.put("Hunar",89);
        students.put("Barzy",75);
        students.put("Rahman",93);
        students.put("Hardi",80);

        LinkedHashMap<String, Integer> badStudents = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> goodStudents = new LinkedHashMap<>();

        for (String eachKey : students.keySet()){
            int eachValue = students.get(eachKey);
            if (eachValue< 90){
                badStudents.put(eachKey, eachValue);
            } else {
                goodStudents.put(eachKey,eachValue);
            }
        }

        System.out.println(badStudents);
        System.out.println(goodStudents);


    }
}
