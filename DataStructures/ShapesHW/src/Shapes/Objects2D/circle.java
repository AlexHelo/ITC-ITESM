package Shapes.Objects2D;

import Shapes.Shape2D;
import java.lang.Math;
import java.util.Scanner;

/**
 * circle
 */
public class circle extends Shape2D {
    private double radius;
    private double area;
    private double perimeter;

    public circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public static circle getQuestions(Scanner sc) {

        System.out.println("What's the sphere's radius");
        double radius = sc.nextDouble();
        return new circle(radius);
    }

    @Override
    public double getArea() {
        area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = Math.PI * radius;
        return perimeter;
    }

    @Override
    public double getVolume() {
        return 0;
    }

}