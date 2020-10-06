package com.javaguru.student_Denis_Shlichkov.lesson_3.level_6.task_26;

class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Vodka");
        product.setRegularPrice(7);
        product.setDiscount(4);
        product.printInformation();
    }
}
