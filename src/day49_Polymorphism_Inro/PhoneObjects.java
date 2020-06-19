package day49_Polymorphism_Inro;

public class PhoneObjects {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("XS", 1000, "max");
        iphone.calling(7035095655l);
        iphone.texting(7034480908l);
        iphone.download();
        iphone.faceTiming(7986783212l);
        System.out.println(iphone.toString());
    }
}
