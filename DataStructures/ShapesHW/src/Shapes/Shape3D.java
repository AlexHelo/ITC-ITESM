package Shapes;

import java.util.Scanner;

import Shapes.Objects3D.*;

/**
 * Shape2D
 */
public class Shape3D implements ShapeInterface {
    private String name;
    private Shape3D Shape;

    public Shape3D(String name) {
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
        System.out.println("What type of shape do you want?" + "\n" + "1)Cube" + "\n" + "2)Sphere" + "\n"
                + "3)Tetrahedron" + "\n" + "4)Exit");
        int choice = sc.nextInt();
        switch (choice) {
        case 1:
            Shape = cube.getQuestions(sc);
            this.calculate(Shape, sc);
            break;
        case 2:
            Shape = sphere.getQuestions(sc);
            this.calculate(Shape, sc);
            break;
        case 3:
            Shape = tetrahedron.getQuestions(sc);
            this.calculate(Shape, sc);
            break;

        case 4:
            System.exit(0);
            break;

        default:
            System.out.println("Option not found, try again");
            this.selection(sc);
            break;
        }
    }

    public void calculate(Shape3D shape, Scanner sc) {
        System.out.println("What do you want to calculate?" + "\n" + "1)Area" + "\n" + "2)Perimeter" + "\n" + "3)Volume"
                + "\n" + "4)Exit");
        int choice = sc.nextInt();
        switch (choice) {
        case 1:
            System.out.println(Shape.getArea());
            break;
        case 2:
            System.out.print(Shape.getPerimeter());
            break;
        case 3:
            System.out.print(Shape.getVolume());
            break;
        case 4:
            System.exit(0);
            break;

        default:
            System.out.println("Option not found, try again");
            this.calculate(shape, sc);
            break;
        }
    }
}
