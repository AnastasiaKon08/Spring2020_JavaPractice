package day43_MethodOverriding;

public class ShapeObjects {

    public static void main(String[] args) {
        Circle circle1 = new Circle(3);

        System.out.println(circle1.radius);


        circle1.calculateArea(); // bug
        circle1.calculatePerimeter(); //bug

        Rectangle rectangle1 = new Rectangle(13, 14);

        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();


        Square square1 = new Square(5);

        System.out.println( square1.side);
        square1.calculateArea(); //bug
        square1.calculatePerimeter(); //bug
    }
}
