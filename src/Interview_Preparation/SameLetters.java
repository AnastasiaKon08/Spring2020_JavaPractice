package Interview_Preparation;

public class SameLetters {
// Write a return method that check if a string is build out of the same letters as another string.
//
//Ex:  same("abc",  "cab"); -> true
//
//same("abc",  "abb"); -> false:

    public static void main(String[] args) {
        String str = "";
        System.out.println("same(\"abc\",  \"cab\") = " + same("abc", "cab"));
        //System.out.println("same(\"abc\",  \"abb\") = " + same("abc", "abb"));
       // System.out.println(str.isEmpty());
    }
    public static boolean same( String str1, String str2){

        for ( int i=0; i<str1.length(); i++){
            if (str2.contains(""+str1.charAt(i))){
                str2.replaceFirst(str1.charAt(i)+"", "");
                System.out.println(str2);
            }

        }

        if(str2.isEmpty()){
            return true;
        } else {
            return false;
        }
    }


}
