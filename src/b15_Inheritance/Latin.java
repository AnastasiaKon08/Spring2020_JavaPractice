package b15_Inheritance;

public class Latin extends Language {
    public static void main(String[] args) {

        Latin latin = new Latin();
        latin.firstAlphabet = 'A'; // public
        latin.pronunciation = "good"; // protected
        latin.numberOfUsers = 80000000000L; //default


    }

}
