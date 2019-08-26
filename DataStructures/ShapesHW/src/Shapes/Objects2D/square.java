package Shapes.Objects2D;

import java.util.Scanner;

import Shapes.Shape2D;

/**
 * square
 */
public class square extends Shape2D {
    private double side;
    private double area;
    private double perimeter;

    public square(double side) {
        super("Square");
        this.side = side;
    }

    public static square getQuestions(Scanner sc) {
        System.out.println("What's the legth of the side?");
        double side = sc.nextDouble();
        return new square(side);
    }

    @Override
    public double getArea() {
        area = side * side;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = 4 * side;
        return perimeter;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}