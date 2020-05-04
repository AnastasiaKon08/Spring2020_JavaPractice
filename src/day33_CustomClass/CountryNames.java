package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountryNames {
    public static void main(String[] args) {

        ArrayList<String> countryName = new ArrayList<>(Arrays.asList("Russia", "United States of America", "United Kingdom", "Spain", "Amsterdam"));
        countryName.removeIf( p-> p.length()>=10);
        System.out.println(countryName);
    }
}
/*
3. task:
			1. create an ArrayList of string called country names
			2. write a program that can remove all the country names that have length of 10 or greater

 */