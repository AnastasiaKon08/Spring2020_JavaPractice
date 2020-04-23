package day05_Unary_ShorthandOperators;

public class PrimitiveCasting {

    public static void main(String[] args) {
      // implicit casting. Done automatically
        int a = 10;
        long b = a; // implicit casting done automatically
        // b = 10L;

        // int c = b; because b is still long data type

        int a1 = 100;
        long b1 = (long)a1; // implicit casting done manually

       //  int c1 = b1;

        // Explicit casting:
        int Inum = 100;
        byte Bnum = (byte)Inum;

        short Snum = (short)Inum; // = (byte)Inum;

        double Dnum = 5.5;

        // float Fnum = (float)Dnum; // 5.5
        float Fnum = (int)Dnum; // 5.0
        System.out.println(Fnum);


        double d1 = 10.5;
       long l1 = (long)d1; // int/short
        System.out.println(l1);


        float f1 = 60.5f;
        int i1 = (int)f1;
        System.out.println(i1);

        char ch1 = 'a';
        short sh1 = (short)ch1;
        System.out.println(sh1);

        char ch2= 23456;
        System.out.println(ch2);

        double dbl1 = ch2;
        System.out.println(dbl1);

        int z1 = 10;
        double t1b = z1;
        short y1 = (short)z1; //explicit casting



    }
}
