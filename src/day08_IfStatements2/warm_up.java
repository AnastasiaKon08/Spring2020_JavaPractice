package day08_IfStatements2;

public class warm_up {
    public static void main(String[] args) {
       double n1 = 89;
        double n2 = 89;
        double n3 =89;

        if (n1 == n2 && n1!= n3){
            System.out.println( n1 + " and " + n2 + " are equal");
        } else if (n2 == n3 && n2 != n1){
            System.out.println( n2+ " and " + n3 + " are equal");
        } else if (n1 == n3 && n1 != n2) {
            System.out.println(n1 + " and " + n3 + " are equal");
        } else if (n1 == n2 && n2== n3){
            System.out.println("all are equal");
        } else {
            System.out.println("None of the numbers are equal");
        }
    }
}


/*

1.  write a program that can check the equality of the three given numberrs
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal
	2.. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
 */