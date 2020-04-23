package day13_StringClass;

public class StringManipulation2 {
    public static void main(String[] args) {

        String str = "Cybertek School is the best";
        //            012345678

        String schoolName = str.substring(0,8);
        System.out.println(schoolName);

        String fullName = "Anastasia Kononosova";
        //                 0123456789
        String firstName = fullName.substring(0,9);
        System.out.println(firstName);

        String lastName = fullName.substring(10,20);
        System.out.println(lastName);

        // lastname_firstName@gmail.com

        String gmail = lastName.concat("_").concat(firstName).concat("@gmail.com");
        //String gmail = lastName+"_"+firstName+"@gmail.com";
        System.out.println(gmail);


        String s2 = "I like C# Programming";
            s2 = s2.replace("C#", "Java");
        System.out.println(s2);


        String nam = "COVID 18";
        nam = nam.replace("18","19");
        System.out.println(nam);


        String r1 = "I like C#, C# is fun, C# is cool";
        r1 = r1.replaceFirst("C#", "Java");
        System.out.println(r1);


        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
        r2 = r2.replaceFirst("Tomorrow", "Today");
        System.out.println(r2);



    }
}
