package com.javaguru.student_vadim_migun.lesson_3.level_4;
/*
Найти ошибку в коде.
Исправить и запустить программу.
Менять можно только класс Car.

class Car {

    private String model;

    public Car(String newModel) {
        this.model = newModel;
    }

    public String getModel {
        return this.model
    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}
 */
public class Car {
    private String model;

    public Car(String newModel) {
        this.model = newModel;
    }

    public String getModel() {
        return this.model;
    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }
}
