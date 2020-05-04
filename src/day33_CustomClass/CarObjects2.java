package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects2 {
    public static void main(String[] args) {
        Car car1= new Car();

        car1.setCarInfo("BMW", "X5", 2020, "Black");
        car1.getCarInfo();

        Car car2 = new Car();
        car2.setCarInfo("Toyota", "Prius", 2014, "Blue");
        car2.getCarInfo();


        Car car3 = new Car();
        car3.setCarInfo("Audi", "07", 2020, "White");
        car3.getCarInfo();

        System.out.println("==========================");
        Car[] cars = {car1, car2, car3};

        for ( Car each :cars){
            each.getCarInfo();
        }

        System.out.println("==========================");
        System.out.println(car1.toString());

        // ArrayList<String> list = new ArrayList<>(Arrays.asList(car1, car2, car3));

    }
}
