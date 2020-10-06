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

package com.javaguru.student_sergey_kazyanin.lesson_3.level_6.Task26;

class Product {
    private String name;
    public double regularPrice;
    public double discount;

    public Product(String name) {
        this.name = name;
    }

    public double actualPrice() {
        return regularPrice - (regularPrice * discount)/100;
    }

    public void printInformation() {
        String textInfo = "Наименование товара - " + name +
                "\nСтандартная цена - " + regularPrice +
                "\nСкидка - " + discount + " %";
        System.out.println(textInfo);
    }



}
