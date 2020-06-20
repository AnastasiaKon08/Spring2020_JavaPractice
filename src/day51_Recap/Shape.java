package day51_Recap;

interface Volume{
    boolean hasVolume = true;
    abstract double calculateVolume();

         }

interface PI{
    double PI = 3.14;
}


public abstract class Shape {
    static String name;
    abstract double calculateArea();
    abstract double calculatePerimeter();

}

final class Circle extends Shape implements PI{
    double radius;
    static {
        name = "Circle";
    }

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return PI* radius *radius;
    }

    @Override
   public  double calculatePerimeter(){
        return 2*radius*PI;
    }
}

final class Cylinder extends Shape implements Volume, PI {
    double radius;
    double height;
    static {
        name = "Cylinder";
    }

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return (PI * radius * 2* radius) + (height * PI * 2 * radius);
    }

    @Override
    public double calculatePerimeter(){
        return  2 * (PI * 2 * radius + height);
    }

    @Override
    public double calculateVolume(){
        return PI * radius * radius * height;
    }
}




/*


    Note:   Volume of Cylinder = PI * radius * radius * height
            Area of Cylinder = (PI * diameter * radius) + (height * PI * diameter);
            Perimeter of Cylinder = 2 * (PI * diameter + height)
            Area of Circle = PI * radius * radius
            Perimeter of Circle = 2 * radius * PI
 */