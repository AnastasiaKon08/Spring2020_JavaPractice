package day13_StringClass;

public class StringManipulation3 {
    public static void main(String[] args) {


String str = "I like Java programming";
 int num1 = str.indexOf("J");
        System.out.println(num1);

  int num = str.indexOf("like");
        System.out.println(num);

   String fullName = "Anastasia Coada";
   String FirstName = fullName.substring(0, fullName.indexOf(" "));
   String lastName = fullName.substring( fullName.indexOf(" ")+1);
        System.out.println(FirstName);
        System.out.println(lastName);





    }
}
