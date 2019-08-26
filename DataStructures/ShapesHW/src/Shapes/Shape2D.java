package Shapes;

import java.util.Scanner;

import Shapes.Objects2D.*;

/**
 * Shape2D
 */
public class Shape2D implements ShapeInterface {
    private String name;
    private Shape2D Shape;

    public Shape2D(String name) {
        this.name = name;
    }

    // Added methods because of the implementation, the class could be abstract to
    // avoid this, however, we need to instance it to be able to print the different
    // list instead of having a giant switch statement in Main.
    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    public void selection(Scanner sc) {
        System.out.println("What type of shape do you want?" + "\n" + "1)Circle" + "\n" + "2)Polygon" + "\n"
                + "3)Square" + "\n" + "4)Triangle");
        int choice = sc.nextInt();
        switch (choice) {
        case 1:
            Shape = circle.getQuestions(sc);
            this.calculate(Shape, sc);
            break;
        case 2:
            Shape = polygon.getQuestions(sc);
            this.calculate(Shape, sc);
            break;
        case 3:
            Shape = square.getQuestions(sc);
            this.calculate(Shape, sc);
            break;
        case 4:
            Shape = triangle.getQuestions(sc);
            this.calculate(Shape, sc);
            break;
        case 5:
            System.exit(0);
            break;

        default:
            System.out.println("Option not found, try again");
            this.selection(sc);
            break;
        }
    }

    public void calculate(Shape2D shape, Scanner sc) {
        System.out.println("What do you want to calculate?" + "\n" + "1)Area" + "\n" + "2)Perimeter" + "\n" + "3)Exit");
        int choice = sc.nextInt();
        switch (choice) {
        case 1:
            System.out.print(Shape.getArea());
            break;
        case 2:
            System.out.print(Shape.getPerimeter());
            break;
        case 3:
            System.exit(0);
            break;

        default:
            System.out.println("Option not found, try again");
            this.calculate(shape, sc);
            break;
        }
    }
}
