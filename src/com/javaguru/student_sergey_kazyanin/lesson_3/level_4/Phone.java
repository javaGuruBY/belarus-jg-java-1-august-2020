/*
Task_15
Найти ошибку в коде.
Исправить и запустить программу.
Менять можно только класс Phone.

class Phone {

    private String model;

    public Book(String newModel) {
        this.model = newModel;
    }

    public String getModel() {
        return this.model;
    }

}

class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}

* */
package com.javaguru.student_sergey_kazyanin.lesson_3.level_4;

class Phone {

    private String model;

    public Phone(String newModel) {     // имя конструктора должно иметь имя класса
        this.model = newModel;
    }

    public String getModel() {
        return this.model;
    }

}

class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}
