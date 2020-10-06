package com.javaguru.student_sergey_kazyanin.lesson_3.level_6.Task26;

class ProductDemo {
    public static void main(String[] args) {
        Product comp = new Product("Ноутбук Lenovo X5 Carbon");
        comp.regularPrice = 100;
        comp.discount = 10;
        comp.printInformation();
        double dicountPrice = comp.actualPrice();
        System.out.println("Цена со скидкой: " + dicountPrice);

    }
}