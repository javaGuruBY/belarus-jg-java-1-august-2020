package com.javaguru.student_sergey_kazyanin.lesson_3.lessoncode;

public class CarDemo {
    public static void main(String[] args) {
        Car firstCar = new Car();
        firstCar.setColor("Red");
        firstCar.setModel("BMW");
        firstCar.setMaxSpeed(250);

        System.out.println("Car color: " + firstCar.getColor());
        System.out.println("Car model: " + firstCar.getModel());
        System.out.println("Car maxspeed: " + firstCar.getMaxSpeed());


        System.out.println("Car current speed: " + firstCar.getCurrentSpeed());

        firstCar.accelerate();
        System.out.println();
        System.out.println("Car current speed: " + firstCar.getCurrentSpeed());
    }
}
