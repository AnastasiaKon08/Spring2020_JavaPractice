package day38_Constructors;

public class CircleObj {
    public static void main(String[] args) {


        double r = 5.5;
        Circle circle1 = new Circle(r);

        double areaOfCircle = circle1.area();
        System.out.println(areaOfCircle);

    }
}