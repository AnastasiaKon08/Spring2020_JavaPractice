package day14_StringClass;

public class WebAddress {
    public static void main(String[] args) {

        String website = "www.cybertek.ru";
         website = website.toLowerCase();
         if (website.startsWith("www.") && (website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".net") || website.endsWith(".gov") || website.endsWith(".net"))){
             System.out.println("The web address is valid");}
             else {
            System.out.println("The web address is invalid");
        }









    }
}
