package MyPractice2;

public class AddSpaces {
    public static void main(String[] args) {
    String ex = "HelloFriends!It'sNiceOutThereToday!";
        System.out.println(AddSpace(ex));
    }
    public static String AddSpace (String str){
        // String result =" ";
    for (int i = 0; i< str.length(); i++){
       if (Character.isUpperCase(i) && Character.isAlphabetic(i)){
           str = str.replace(str.charAt(i), ' ');
           System.out.println(str);
        }
    }
    return str;
    }
}
/*
Additional task to practice Custom method, Wrapper class methods:
Method name: AddSpaces
Param: String str
Return: String
Write a method that takes a String as a parameter where all words are written together with no spaces
and this method should add spaces between words and return as new String.
Each new word begins with a capital letter.
Ex: AddSpaces( "HelloFriends!It'sNiceOutThereToday!");
returns --> "Hello Friends! It's Nice Out There Today!
AddSpaces("JavaIsFun"); returns --> "Java Is Fun"
 */