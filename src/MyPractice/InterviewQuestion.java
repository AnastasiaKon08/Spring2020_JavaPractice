package MyPractice;

public class InterviewQuestion {
    public static void main(String[] args) {
        String str = "     Such   a    good   day    today    ";

        str = str.trim();
        while (str.contains("  ") ){
            str = str.replace("  ", " ");
        }

        System.out.println(str);
    }

}
