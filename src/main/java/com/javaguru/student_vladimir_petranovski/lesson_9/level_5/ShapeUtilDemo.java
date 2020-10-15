package com.javaguru.student_vladimir_petranovski.lesson_9.level_5;

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = rectangle.calculateArea();
        double rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.println(rectangleArea);
        System.out.println(rectanglePerimeter);
    }
}
