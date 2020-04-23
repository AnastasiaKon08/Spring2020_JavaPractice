package day19_Arrays;

public class Arrays_Practice1 {
    public static void main(String[] args) {

        String[] friends = {"Ana", "Kate", "Liam", "John", "Dan", "Frank", "Mary"};
                    //        0,       1,    2,      3,      4

        /*

       String str =  friends[4];
        System.out.println(str);
        System.out.println(friends[2]);

         */

        for (int i =0; i<=6; i++){
            String name = friends[i];
            System.out.print(name +" ");
        }
        System.out.println();

        String[] emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@outlook.com", "cybertek@hotmail.com"};

        for (int i =0; i<=3; i++){
            String result = emails[i];
            if (result.endsWith("gmail.com")){
                System.out.println(result);
            }
        }










    }
}
