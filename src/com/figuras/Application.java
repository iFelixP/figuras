package com.figuras;

import com.figuras.model.Circle;
import com.figuras.model.Rectangle;
import com.figuras.model.Square;
import com.figuras.model.Triangle;

public class Application {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5), circle2 = new Circle(7);
        Rectangle rectangle = new Rectangle(10, 20);
        Square squares[] = new Square[5];
        Triangle triangle = new Triangle(10, 20);

        squares[0] = new Square(30);
        squares[1] = new Square(5);
        squares[2] = new Square(23);
        squares[3] = new Square(14);
        squares[4] = new Square(7);


        printFigure(circle1);
        printFigure(circle2);
        printFigure(rectangle);
        for (Square square : squares) {
            printFigure(square);
        }
        printFigure(triangle);

    }

    public static void printFigure(Circle circle) {
        circle.draw();
        System.out.println("Area: " + circle.getArea());
    }

    public static void printFigure(Rectangle rectangle) {
        rectangle.draw();
        System.out.println("Area: " + rectangle.getArea());
    }

    public static void printFigure(Square square) {
        square.draw();
        System.out.println("Area: " + square.getArea());
    }

    public static void printFigure(Triangle triangle) {
        triangle.draw();
        System.out.println("Area: " + triangle.getArea());
    }
}
