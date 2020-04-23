package day18_NestedLoops;

public class DoWhile_Practice {
    public static void main(String[] args) {

        int i =0;
        do{
            System.out.print(i+ " ");
            i+=2;
        }while(i%2==0 && i<=100);

        System.out.println();
        System.out.println("========================================");

        int num = 0;
        do{
            if( num%2!=0){
                System.out.print(num+" ");
            }

                num++;

        } while(num<=100);


        System.out.println();

        int j = 1;
        do{
            j++;
            System.out.println(j);

        } while (j<=5);

        System.out.println("========================================");

        int z =1;
        do{
            System.out.println(z);
            if (z==3){
                break;
            }
            z++;
        } while (z<=5);



        System.out.println("========================================");

        int y = 1;

        do{
            if (y==3){
                y++; // need to make sure the iterator is not skipped6
                continue;
            }

            System.out.println(y);
            y++;
        }while(y<=5);


        System.out.println("========================================");

        int t=1;

        do{
            if (t%2!=0){
                t++;
                continue;
            }
            System.out.print(t+ " ");

            t++;
        }while(t<=100);



    }
}
