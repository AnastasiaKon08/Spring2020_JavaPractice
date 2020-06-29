package day54_Maps;

public class String_VS_Builder_VS_Buffer {

    public static void main(String[] args) {

        String str1 = "cybertek";
        str1.concat(" school");
        System.out.println(str1);  // cybertek

        StringBuilder builder = new StringBuilder("Cybertek");
        builder.append(" school");
        System.out.println(builder); // cybertek school

        StringBuffer buffer = new StringBuffer("Cybertek");
        buffer.append(" school");
        System.out.println(buffer);

        System.out.println("=============================");


        String word = "ABCD";
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();

        System.out.println(sb);



    }
}
