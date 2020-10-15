package com.javaguru.student_vladimir_petranovski.lesson_9.level_5;

import java.util.Random;

class ShapeUtil {
    private Random random = new Random();

    Circle createRandomCircle() {
        return new Circle("Circle", random.nextDouble());
    }

    Square createRandomSquare() {
        return new Square("Square", random.nextDouble());
    }

    Rectangle createRandomRectangle() {
        return new Rectangle("Rectangle", random.nextDouble(), random.nextDouble());
    }

    Triangle createRandomTriangle() {
        return new Triangle("Triangle", random.nextDouble());
    }

    Circle createCircle(double radius) {
        return new Circle("Circle", radius);
    }

    Square createSquare(double length) {
        return new Square("Square", length);
    }

    Rectangle createRectangle(double length, double height) {
        return  new Rectangle("Rectangle", length, height);
    }

    Triangle createTriangle(double length) {
        return  new Triangle("Triangle", length);
    }

    Shape createRandomShape() {
        int numbers = (int) (Math.random() * 4 + 1);
        Shape result = null;
        switch (numbers) {
            case 1:
                result = createRandomCircle();
                break;
            case 2:
                result = createRandomSquare();
                break;
            case 3:
                result = createRandomRectangle();
                break;
            case 4:
                result = createRandomTriangle();
                break;
        }
        return result;
    }

    Shape[] createArrayFromShape() {
        Shape[] shapes = {createRandomCircle(), createRandomSquare(), createRandomRectangle(), createRandomTriangle()};
        return shapes;
    }

    double calculateArea(Shape[] shapes) {
        double areaAll = 0;
        for (int i = 0; i < shapes.length; i++) {
            areaAll += shapes[i].calculateArea();
        }
        return areaAll;
    }

    double calculatePerimeter(Shape[] shapes) {
        double perimeterAll = 0;
        for (int i = 0; i < shapes.length; i++) {
            perimeterAll += shapes[i].calculatePerimeter();
        }
        return perimeterAll;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
