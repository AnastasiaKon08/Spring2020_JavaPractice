package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Intro {
    public static void main(String[] args) {

        Map<String, Double> employeeInfo = new LinkedHashMap<>(); // map declaration

        employeeInfo.put("Zarina", 123000.0);
        employeeInfo.put("Kai", 121000.0);

        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());


        System.out.println(employeeInfo.get("Zarina"));
        System.out.println(employeeInfo.get("Kai"));

        employeeInfo.remove("Kai");
        System.out.println(employeeInfo.size());




    }
}
