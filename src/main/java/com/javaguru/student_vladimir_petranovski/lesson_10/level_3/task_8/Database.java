package com.javaguru.student_vladimir_petranovski.lesson_10.level_3.task_8;

public interface Database {
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
