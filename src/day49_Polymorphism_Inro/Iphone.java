package day49_Polymorphism_Inro;

public final class Iphone extends Phone implements AppleApps {

    static {
        brand = "Apple";
    }

    public Iphone(String model, double price, String size) {
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void download(){
        System.out.println("iPhone is downloading apps " + AppStoreName);
    }

    @Override
    public void texting(long phoneNumber){
        System.out.println("iPhone is texting " + phoneNumber);
    }

    @Override
    public void calling(long phoneNumber){
        System.out.println("iPhone is calling " + phoneNumber);
    }

    public void faceTiming (long phoneNumber){
        System.out.println("iPhone is face timing " + phoneNumber);
    }



}
