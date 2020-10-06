package com.javaguru.teacher.lesson_3.lessoncode;

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
        currentSpeed += 1;
//        currentSpeed++;
//        currentSpeed = currentSpeed + 1;
    }
}
