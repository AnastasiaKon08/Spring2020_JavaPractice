package day51_Recap;

import day37_Constractors_.CybertekStudents;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeObjects {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(6);
        Cylinder cylinder1 = new Cylinder(3, 5);
        Cylinder cylinder2 = new Cylinder(6, 10);


        ArrayList<Shape> listOfShapes = new ArrayList<>(Arrays.asList(circle1, circle2, cylinder1, cylinder2));
        System.out.println(listOfShapes);

        Shape shape1 = circle1; // upcasting
        Shape shape2 = new Cylinder(3, 6);
        ( (Cylinder) shape2 ).calculateVolume(); // downcasting

        for (Shape eachShape : listOfShapes){
            System.out.println(eachShape.name + " area: " + eachShape.calculateArea());
        }

        System.out.println("==========================");
        double p = ((Circle) listOfShapes.get(1)).calculatePerimeter();
        System.out.println(p);


        Shape s1 = new Circle(7);
        System.out.println(((Circle)s1).radius);


    }
}

/*
 create a class named ShapeObjects
                1. create two circle and two Cylinder' objects
                2. create an ArrayList that can contain  all those objects
 */