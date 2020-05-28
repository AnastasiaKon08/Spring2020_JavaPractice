package b15_Inheritance;

public class Language {
   private String name;
    private String region;
    private int numberOfLetters;
    protected String pronunciation;
    public char firstAlphabet;
    long numberOfUsers;


    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public int getNumberOfLetters() {
        return numberOfLetters;
    }

    // Encapsulation - protecting data

    public Language(){

    }

    public Language(String name, String region, int numberOfLetters){
        this.name = name;
        this.numberOfLetters = numberOfLetters;
        this.region = region;

    }

    public void setName(String name){
        this.name = name;
    }

    public void setRegion(String region){
        this.region = region;
    }

    public void setNumberOfLetters(int numberOfLetters) {
        this.numberOfLetters = numberOfLetters;
    }


}
