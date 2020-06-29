package day54_Maps;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Practice {
    public static void main(String[] args) {

        LinkedHashMap<String, LocalDate> friendsBirth = new LinkedHashMap<>();
        friendsBirth.put("Anna",  LocalDate.of(1996,02,16));
        friendsBirth.put("Anastasia", LocalDate.of(1992, 03, 2));
        friendsBirth.put("Ion", LocalDate.of(1994, 10, 9));
        friendsBirth.put("Paul", LocalDate.of(1992, 03, 2));
        friendsBirth.put("Paul", LocalDate.of(1982, 05, 2));

        System.out.println(friendsBirth.size());
        System.out.println(friendsBirth);

        System.out.println(friendsBirth.get("Paul"));

        System.out.println(friendsBirth.containsKey("Muhtar"));

        System.out.println(friendsBirth.containsValue(LocalDate.of(1994, 10, 9)));

        friendsBirth.clear();
        System.out.println(friendsBirth);


    }
}
