package day48_AbstractInterface;

public class Samsung extends Phone{


    public Samsung(String brand, String model, double price, String size){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
    }


    @Override
    public void calling(long phoneNumber) {
        System.out.println("Calling from Samsung");
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Texting from Samsung");
    }
}
