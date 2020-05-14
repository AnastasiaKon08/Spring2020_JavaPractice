package day39_AccessModifiers;

public class Car {

    String brand;
    String model;
    int year;
    double price;

    public Car(String brand){
        this.brand = brand;
    }

    public Car(String brand, String model, int year, double price){
        this(brand);
        this.model = model;
        this.year = year;
        this.price = price;

    }

    public String toString(){
        return "Car: " + brand +" "+ model +",  "+ year + ", Price: " + price;
    }
}
