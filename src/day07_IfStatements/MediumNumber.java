package day07_IfStatements;

public class MediumNumber {
    public static void main(String[] args) {
        double a = 3647;
        double b = 65740;
        double c = 4563;

        // a: if ( a<b &&  a>c) or (a<c && a>b)
        // b: if b<c && b>a or b>c && b<a
        // c: if c<b && c>a or c>b && c<a

        boolean aMedium = (a<b && a>c) || (a<c && a>b);
        boolean bMedium = (b<c && b>a ) || (b>c && b<a);
        boolean cMedium = (c<b && c>a) || (c>b && c<a);

        if (aMedium){
            System.out.println("a is medium");
        }
        if (bMedium){
            System.out.println("b is medium");
        }
        if (cMedium){
            System.out.println("c is medium");
        }








    }
}


/*
 write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)
 */