package day37_Constractors_;
import java.util.Arrays; // only imports Arrays class from java.util
import java.util.*; // all classes from java.util
import static day37_Constractors_.Data.staticVariable;
import static day37_Constractors_.Data.staticMethod;

public class ImportStatement {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1,};
        Arrays.sort(arr);
        System.out.println(staticVariable);
       staticMethod();

    }
}
