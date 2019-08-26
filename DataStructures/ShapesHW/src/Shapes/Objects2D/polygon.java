package Shapes.Objects2D;

import java.util.Scanner;

import Shapes.Shape2D;

/**
 * polygon - 5 sides or above (1/2bh)
 */
public class polygon extends Shape2D {

    double side;
    double apothem;
    double numOfSides;
    double area;
    double perimeter;

    public polygon(double numOfSides, double side, double apothem) {
        super("Polygon");
        this.numOfSides = numOfSides;
        this.side = side;
        this.apothem = apothem;
    }

    public static polygon getQuestions(Scanner sc) {
        System.out.println("What's the number of sides?");
        double numOfSides = sc.nextDouble();
        System.out.println("What's the length of the side");
        double side = sc.nextDouble();
        System.out.println("What's the apothem?");
        double apothem = sc.nextDouble();
        return new polygon(numOfSides, side, apothem);
    }

    @Override
    public double getArea() {
        area = ((numOfSides * side * apothem) / 2);
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = side * numOfSides;
        return perimeter;
    }

    @Override
    public double getVolume() {
        return 0;
    }

}