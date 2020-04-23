package day24_Methods_Continue;

public class StringReverse {
    public static void main(String[] args) {
       String name = Reverse1("Cybertek");
        System.out.println(name);
    }


    public static void Reverse(String str){
        String reverse ="";
        for (int i=str.length()-1; i>=0; i--){
            reverse+= str.charAt(i);
        }
        System.out.println(reverse);
    }

    public static String Reverse1(String str){
        String reverse ="";
        for (int i=str.length()-1; i>=0; i--){
            reverse+= str.charAt(i);
        }
        return reverse;
    }
}
