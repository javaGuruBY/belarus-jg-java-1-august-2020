package com.javaguru.student_vadim_migun.lesson_3.level_6.Task_24;
/*
Выберите два разных объекта из реального мира.
Для каждого объекта выделите 2 - 3 самых важных
свойства и поведения, которое с этими свойствами
связано. Создайте для каждого объекта из реального
мира Java класс с его описанием. Создайте так же
Demo класс для каждого описанного вами объекта
и продемонстрируйте работу с объектом.
 */

class Car {

    private String model;
    private String color;
    private int year;

    public Car (String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public String getModel(){
        return this.model;
    }
    public String getColor(){
        return this.color;
    }
    public int getYear(){
        return year;
    }
}

class CarDemo{
    public static void main(String[] args) {
        Car myCar = new Car("Ford fiesta", "silver",2010);
        String model = myCar.getModel();
        String color = myCar.getColor();
        int year =  myCar.getYear();
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: "+ year);
    }
}