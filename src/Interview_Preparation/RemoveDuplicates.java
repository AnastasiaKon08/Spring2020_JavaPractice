package Interview_Preparation;

public class RemoveDuplicates {
    //Write a return method that can remove the duplicated values from String

    public static void main(String[] args) {
        System.out.println("removeDup(\"AAABBBCCC\") = " + removeDup("AAABBBCCC"));
    }

    public static String removeDup(String str){
        String result="";

        for (int i =0; i<str.length(); i++){
            if (!result.contains(""+str.charAt(i))){
                result+= str.charAt(i);
            }
        }

        return result;
    }
}
