package day49_Polimorphism_Inro;


interface downloadable{
     boolean downloadable = true; // public static by default
     void download(); // public abstract
}

interface AndroidApps extends downloadable{ // 2 variables and 1 abstract method
    String AppStoreName = "Android";
}

interface AppleApps extends downloadable{
    String AppStoreName = "Apple"; // 2 var, 1 abstract method
}
public abstract class Phone {
    static String brand;
    String model;
    double price;
    String size;

  public abstract void texting(long phoneNumber); // abstract keyword should be given in abstract class

  public abstract void calling(long phoneNumber);

  public String toString(){
      return "Brand: " + brand + ", model " + model + ", price: "+ price +", size " + size;
  }



}
