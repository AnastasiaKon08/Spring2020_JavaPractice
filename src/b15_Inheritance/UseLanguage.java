package b15_Inheritance;

import org.w3c.dom.ls.LSOutput;

public class UseLanguage {
    public static void main(String[] args) {


        Language english = new Language("en", "US", 26);
        System.out.println("Region " + english.getRegion());
        english.setRegion("UK");
        System.out.println("Region " + english.getRegion());




    }
}