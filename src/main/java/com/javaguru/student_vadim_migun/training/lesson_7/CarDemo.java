package com.javaguru.student_vadim_migun.training.lesson_7;

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

        int a = 5;
        String result = a == 7 ? "Five" : "Not Five";
        System.out.println(result);

    }
}
