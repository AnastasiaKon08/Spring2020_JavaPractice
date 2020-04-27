package MyPractice;

public class MergeTwoString {
    public static String mergeStrings(String one, String two) {
        String result = "";
        int j =0;
        while(j<two.length()){
            for (int i=0; i<one.length(); i++){
                result+=""+one.charAt(i) + two.charAt(j);
                j++;
            }
        }

        return result;
    }


    public static void main(String[] args){
        System.out.println(mergeStrings("java", "selenium"));
    }
}
