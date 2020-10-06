package com.javaguru.teacher.lesson_3.lessoncode;

class CarDemo {

    /*
    default values:
    int, short, byte, long - 0
    float, double - 0.0
    boolean - false
     */
    public static void main(String[] args) {
        Car firstCar = new Car();
        firstCar.setColor("Red");
        firstCar.setModel("BMW");
        firstCar.setMaxSpeed(250);

        System.out.println("Car color: " + firstCar.getColor());
        System.out.println("Car model: " + firstCar.getModel());
        System.out.println("Car max speed: " + firstCar.getMaxSpeed());

        System.out.println("Car current speed: " + firstCar.getCurrentSpeed());

        firstCar.accelerate();
        firstCar.accelerate();
        firstCar.accelerate();
        firstCar.accelerate();
        firstCar.accelerate();

        System.out.println("Car current speed: " + firstCar.getCurrentSpeed());
    }
}
