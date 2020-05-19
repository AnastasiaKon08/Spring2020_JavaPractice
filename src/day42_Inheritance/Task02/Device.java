package day42_Inheritance.Task02;

public class Device {
    public String brand;
    public String model;
    public double price;
    public static String country = "China";


    public String toString(){
        return  "Brand: " + brand + " " + model + " price: $" + price + ", Made id " + country;
    }

    public void setDevice (String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
}


/*
task02:
		creata a class called device:
				attributes: brand, model, price, country
				methods: toString
		create a class called TV:
				attributes: brand, model, price, country
				methods: watch, toString
		create ba class called phone:
				attributes: brand, model, price, country
				methods: call, text,  toString
 */