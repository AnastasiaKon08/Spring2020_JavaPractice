package Interview_Preparation;

public class FrequencyOfCharacters {

    // Return the frequency of characters in a String
    public static void main(String[] args) {
        String str = "AAABBCDD";
        System.out.println("frequency(str) = " + frequency(str));

    }
    public static String frequency(String str){
        String nonDup = "";
        int count = 0;
        String result = "";

        // create non duplicated String
        for (int i=0; i<str.length(); i++){
            if (!nonDup.contains(""+str.charAt(i))){
                nonDup+= str.charAt(i);
            }
        }
        // create a loop that runs non Dup String and zeroes count
        for (int i =0; i<nonDup.length(); i++){
            count = 0;
            // inside this loop create another one that runs the original string
            for ( int j=0; j<str.length(); j++){
                // inside this loop check if chars from both strings match.
                // If yes, count ++
                if (str.charAt(j) == nonDup.charAt(i) ){
                    count++;
                }
            }
            // inside the main loop concat result
            result+= ""+ nonDup.charAt(i)+count;
        }

        return result;
    }

}
