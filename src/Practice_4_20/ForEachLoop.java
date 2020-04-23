package Practice_4_20;

public class ForEachLoop {
    public static void main(String[] args) {

      int[] arr = { 1, 2, 3, 4, 5, 6};
      for (int each: arr){
          if (each == 3){
              continue;
          }
          System.out.print(each+ " ");
      }

        System.out.println();


      int [] arr2 ={1, 2, 3, 4, 5, 6 ,7 ,8 ,9 ,10};
      for( int eac: arr2){
          if (eac%2==0){
              System.out.print(eac+" ");
          }
      }







    }
}
