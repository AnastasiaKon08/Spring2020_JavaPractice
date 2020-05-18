package day40_Encapsulation;



public class Test {
    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
        // obj.ssn; // private
        System.out.println(obj.getSsn());

        obj.setSsn(123456);
        System.out.println(obj.getSsn());
    }
}