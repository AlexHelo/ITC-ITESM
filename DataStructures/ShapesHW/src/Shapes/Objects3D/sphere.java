package Shapes.Objects3D;

import java.util.Scanner;

import Shapes.Shape3D;

/**
 * sphere
 */
public class sphere extends Shape3D {
    private double radius;
    private double area;
    private double volume;
    private double perimeter;

    public sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    public static sphere getQuestions(Scanner sc) {
        System.out.println("What's the sphere's radius");
        double radius = sc.nextDouble();
        return new sphere(radius);
    }

    @Override
    public double getArea() {
        area = 12.566 * (radius * radius);
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = 0;
        // Spheres don't have a perimeter
        return perimeter;
    }

    @Override
    public double getVolume() {
        volume = 4.189 * (radius * radius * radius);
        return volume;
    }
}