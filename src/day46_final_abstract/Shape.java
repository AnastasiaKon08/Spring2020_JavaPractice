package day46_final_abstract;

import java.text.DecimalFormat;

public abstract class Shape {

      abstract void Area();
}

final class Circle extends Shape {

    public double radius;
    public final static double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void Area() {
        double area = radius * radius * PI;
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println("Area of circle is " + df.format(area));
    }
}

class ShapeObjects{

    public static void main(String[] args) {
        Circle obj = new Circle(4.7);
        obj.Area();

        Square sqr = new Square(4);
        sqr.Area();

    }
}

class Square{
    public double side;

    public Square(double side){
        this.side = side;
    }

    void Area(){
        double area = side*side;
        System.out.println("Area of square is " + area);
    }



}
