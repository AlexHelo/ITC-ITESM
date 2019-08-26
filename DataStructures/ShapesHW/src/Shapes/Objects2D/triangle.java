package Shapes.Objects2D;

import java.util.Scanner;

import Shapes.Shape2D;

/**
 * triangle
 */
public class triangle extends Shape2D {
    private double sideA;
    private double sideB;
    private double sideC;
    private double height;
    private double area;
    private double perimeter;

    public triangle(double sideA, double sideB, double sideC, double height) {
        super("Triangle");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    public static triangle getQuestions(Scanner sc) {
        System.out.println("What's the first side of the triangle? (Longest side)");
        double sideA = sc.nextDouble();
        System.out.println("What's the second side of the triangle?");
        double sideB = sc.nextDouble();
        System.out.println("What's the third side of the triangle?");
        double sideC = sc.nextDouble();
        System.out.println("What's the height of the triangle?");
        double height = sc.nextDouble();
        return new triangle(sideA, sideB, sideC, height);

    }

    @Override
    public double getArea() {
        area = (sideA * height) / 2;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = (sideA + sideB + sideC);
        return perimeter;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}