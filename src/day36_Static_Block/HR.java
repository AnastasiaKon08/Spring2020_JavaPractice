package day36_Static_Block;

import day34_CustomClass.Tester;

public class HR {
   static Tester tester1 = new Tester();
    static Tester tester2 = new Tester();
   static  Tester tester3 = new Tester();
  static  Tester tester4 = new Tester();
  static  Tester tester5 = new Tester();

  static{

   tester1.setTesterInfo("Lia ", 235, "SDET", 120000); // method call used in static block

  /*
    public static void main(String[] args) {
        tester1.setTesterInfo("Lia ", 235, "SDET", 120000);

   */
    }
}
