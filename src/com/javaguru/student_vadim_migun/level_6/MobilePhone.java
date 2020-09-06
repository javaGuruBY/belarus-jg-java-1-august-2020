package com.javaguru.student_vadim_migun.level_6;
/*
Выберите два разных объекта из реального мира.
Для каждого объекта выделите 2 - 3 самых важных
свойства и поведения, которое с этими свойствами
связано. Создайте для каждого объекта из реального
мира Java класс с его описанием. Создайте так же
Demo класс для каждого описанного вами объекта
и продемонстрируйте работу с объектом.
 */

class DemoMobilePhone{
    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone();
        myPhone.myPhone ("Xiaomi", 293578851, 200);
    }

}



class MobilePhone {
    private String model;
    private int number;
    private int price;

    public void myPhone(String model, int number, int price){
        this.model = model;
        this.number = number;
        this.price = price;

        System.out.println("Model: " + this.model);
        System.out.println("Call: " + this.number);
        System.out.println("Price: " + this.price);

    }

}
