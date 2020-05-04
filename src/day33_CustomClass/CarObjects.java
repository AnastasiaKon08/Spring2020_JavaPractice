package day33_CustomClass;

public class CarObjects  {
    public static void main(String[] args) {
       Car car1 = new Car();
       car1.Brand ="BMD";
       car1.model ="X5";
       car1.year = 2020;
       car1.color = "black";

        car1.start();
        car1.drive();
        car1.getCarInfo();

        System.out.println("==============");
        Car car2 = new Car();
        car2.Brand = "Toyota";
        car2.model = "Corola";
        car2.year = 2020;
        car2.color = "Red";

        car2.start();
        car2.drive();
        car2.getCarInfo();

        System.out.println("==============");
        Car car3 =new Car();
        car3.Brand = "Mercedes";
        car3.model = "C Class";
        car3.year = 2019;
        car3.color ="White";
        car3.start();
        car3.drive();
        car3.getCarInfo();
    }
}
