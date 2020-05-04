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
    public void getCarInfo() {
        System.out.println("Brand of the car is " + Brand + " " + model + " " + year + " " + color);  // instance variables are objects variables, can be called through the object name
    }

    public void setCarInfo(String carBrand, String carModel, int Caryear, String Carcolor){
        Brand = carBrand;
        model = carModel;
        year = Caryear;
        color = Carcolor;

    }

    public String toString (){
        String result = year+ " " + Brand +" "+ model +" "+  color;

        return result;
    }

    public static void main(String[] args) {
        int a =100; // local variable

    }
}
