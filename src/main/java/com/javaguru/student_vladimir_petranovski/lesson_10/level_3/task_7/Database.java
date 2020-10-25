package com.javaguru.student_vladimir_petranovski.lesson_10.level_3.task_7;
/*
Является ли следующий интерфейс функциональным?

interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}


class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

}
 */

public interface Database { // нет не является, потому что два абстрактных метода и нет аннотации @FunctionalInterface
    void save(Product product);

    Product findByTitle(String productTitle);

}


class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}

