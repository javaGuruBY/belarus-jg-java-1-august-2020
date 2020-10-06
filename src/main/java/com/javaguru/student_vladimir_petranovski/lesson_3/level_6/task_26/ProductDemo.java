package com.javaguru.student_vladimir_petranovski.lesson_3.level_6.task_26;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Shell");
        product.setRegularPrice(200);
        product.setDiscount(20);
        product.printInformation(product);
    }
}
