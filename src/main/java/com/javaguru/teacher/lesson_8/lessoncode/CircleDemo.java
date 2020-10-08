package com.javaguru.teacher.lesson_8.lessoncode;

class CircleDemo {

    private Circle victim = new Circle();

    public static void main(String[] args) {
        CircleDemo demo = new CircleDemo();
        demo.shouldCalculateArea2();
        demo.shouldCalculateArea1();

    }

    void shouldCalculateArea1() {
        victim.setRadius(10);
        double area = victim.calculateArea();
        victim.setRadius(1);
        System.out.println(area);
    }

    void shouldCalculateArea2() {
        double area = victim.calculateArea();
        System.out.println(area);
    }
}
