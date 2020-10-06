package com.javaguru.student_vadim_migun.training;

class Car {
    private String model;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void accelerate() {
        currentSpeed = currentSpeed + 1;
    }
}


class CarDemo {
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
