package day43_MethodOverriding;

public class Square extends Shape{

    public double side;

    public Square(double side){
        this.side = side;
    }

    public void calculateAre(){
        area = side*side;
        System.out.println("Area of square " + area);
    }

    public void calculatePerimeter(){
        perimeter = (side+side)*2;
        System.out.println("Perimeter of square " + perimeter);
    }



}
