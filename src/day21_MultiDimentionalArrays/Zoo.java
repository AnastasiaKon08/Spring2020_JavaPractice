package day21_MultiDimentionalArrays;

public class    Zoo {
    public static void main(String[] args) {
        String[] wildAnimals = {"tiger", "bear", "monkey"};
        String[] birds = {"eagle", "dove", "duck", "chicken"};
        String[][] zoo = {wildAnimals, birds};

        String kfc= zoo[1][2];
        System.out.println(kfc);

        for (String  ptichka: zoo[1]){
            if (ptichka.equals("chicken")){
                continue;
            }
            System.out.println(ptichka);
        }

        for (String wild: zoo[0]){
            if (wild.equals("duck")){
                continue;
            }
            System.out.println(wild);
        }
    }
}
