package day48_AbstractInterface;

public class Iphone extends Phone {

    public Iphone(String brand, String model, double price, String size){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Calling from Iphone");
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Texting from Iphone");
    }
}
