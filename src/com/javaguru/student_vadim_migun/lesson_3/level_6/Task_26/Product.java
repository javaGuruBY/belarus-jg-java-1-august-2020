package com.javaguru.student_vadim_migun.lesson_3.level_6.Task_26;
/*
Разработать класс - продукт,
у которого должны быть следующие характеристики:

Свойства:
- Наименование (String name)
- Стандартная цена (double regularPrice)
- Скидка в процентах (double discount)

Методы:
1. Расчет актуальной стоимости с учетом скидки (double actualPrice())
Вывод информации о продукте в консоль (void printInformation())1P
2. Название продукта нужно задавать через конструктор, а стоимость и скидку через оператор ".".

Класс с объявлением продукта должен называться "Product".
Класс с демонстрацией работы должен называться "ProductDemo".
 */

class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double actualPrice(){
       double actualPrice = regularPrice - (regularPrice * discount)/100;
       return actualPrice;
       }
    public void printInformation(){
        System.out.println("Название продукта: " + name);
        System.out.println("Цена товара без скидки: " + getRegularPrice());
        System.out.println("Цена товара с учетом скидки: " + actualPrice());

    }

}


class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("phone");
        product.setRegularPrice(300);
        product.setDiscount(20);
        product.printInformation();


    }

}