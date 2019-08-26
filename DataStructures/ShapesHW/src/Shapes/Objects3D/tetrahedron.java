package Shapes.Objects3D;

import java.util.Scanner;

import Shapes.Shape3D;

/**
 * tetrahedron
 */
public class tetrahedron extends Shape3D {
    private double side;
    private double area;
    private double volume;
    private double perimeter;

    Scanner sc = new Scanner(System.in);

    public tetrahedron(double side) {
        super("tetrahedron");
        this.side = side;

    }

    public static tetrahedron getQuestions(Scanner sc) {
        System.out.println("How long is the side of the tetrahedron?");
        double side = sc.nextDouble();
        return new tetrahedron(side);
    }

    @Override
    public double getArea() {
        area = 1.732 * (side * side);
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = side * 6;
        return perimeter;
    }

    @Override
    public double getVolume() {
        volume = ((side * side * side) / (8.485));
        return volume;
    }
}