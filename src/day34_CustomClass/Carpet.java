package day34_CustomClass;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;


    public double calCost(){
        double total = (width+length)*unitPrice;
        return (isPersian)?  total+200 : total;

    }

    public void customOrder(double carpetWidth, double carpetLength, double CarpetPrice, boolean carpetPersian){
        width = carpetWidth;
        length = carpetLength;
        unitPrice = CarpetPrice;
        isPersian = carpetPersian;

    }

    public String toString(){
        return "width: "+width+
                "\nlength "+ length+
                "\nunit price $"+ unitPrice+
                "\nTotal cost $"+ calCost();
    }

}
