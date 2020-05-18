package day39_AccessModifiers;

public class CheckInfo {
    public static void main(String[] args) {
        System.out.println("Name " + PersonalInfo.name);
        System.out.println("Gender " + PersonalInfo.gender);
        System.out.println("Age " + PersonalInfo.age);
        // Above are the only public variables that can be accessed from this class

    }
}
