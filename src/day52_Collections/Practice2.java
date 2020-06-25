package day52_Collections;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice2 {
    public static void main(String[] args) {


        String str1 = "abababab";
        String str2 = "ab";

        String[] arr = str1.split("");
        String[] arr2 = str2.split("");

        TreeSet<String> ls = new TreeSet<>(Arrays.asList(arr));
        TreeSet<String> ls2 = new TreeSet<>(Arrays.asList(arr2));

        System.out.println(ls);
        System.out.println(ls);

        str1 = ls.toString();
        str2 = ls2.toString();

        System.out.println(str2.equals(str1));



    }
    }

