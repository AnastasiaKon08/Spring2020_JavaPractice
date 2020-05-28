package day43_MethodOverriding;


import java.text.DecimalFormat;

public class Circle extends Shape {
    public double radius;
    public static double PI = 3.14;
    DecimalFormat df = new DecimalFormat();

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area= PI*radius*radius;
        System.out.println("Area of circle: " + area);
    }

    @Override
    public void calculatePerimeter(){
        perimeter= radius*2*PI;
        System.out.println("Perimeter of circle " + perimeter);
    }


}
