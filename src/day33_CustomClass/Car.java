package day33_CustomClass;

public class Car {

    String Brand;
    String model;
    int year;
    String color;

    public void start(){
        System.out.println(Brand + " " +model+  " is started");

    }

    public void drive(){
        System.out.println("Driving " + Brand+" "+ model);
    }
    public void getCarInfo(){
        System.out.println("Brand of the car is "+ Brand);  // instance variables are objects variables, can be called through the object name
        System.out.println("Model is " + model);
        System.out.println("The year is " + year);
        System.out.println("The color is " + color);
    }


    public static void main(String[] args) {
        int a =100; // local variable

    }
}
