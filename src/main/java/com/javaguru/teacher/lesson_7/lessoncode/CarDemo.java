package com.javaguru.teacher.lesson_7.lessoncode;

class CarDemo {

    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        Car car2 = car1;
        Car car3 = new Car("BMW");

        if (car1.equals(car1)) {
            System.out.println("TRUE - 1");
        }
        if (car1.equals(car2)) {
            System.out.println("TRUE - 2");
        }
        if (car1.equals(car3)) {
            System.out.println("TRUE - 3");
        }
    }
}
