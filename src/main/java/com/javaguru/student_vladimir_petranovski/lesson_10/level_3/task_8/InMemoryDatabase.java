package com.javaguru.student_vladimir_petranovski.lesson_10.level_3.task_8;
/*
Создайте реализацию следующего интерфейса.
Класс должен называться InMemoryDatabase и сохранять продукты в памяти
используя для этого массив или список.

Если продукт не найден при поске то вернуть null.

Обязательно протестируйте созданную вами реализацию интерфейса Database.

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

import java.util.ArrayList;

class InMemoryDatabase implements Database{

    private final ArrayList<Product> products = new ArrayList<>();

    public ArrayList<Product> getProducts() {
        return products;

    }
    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : products) {
            if (productTitle.equals(product.getTitle())) {
                return product;
            }
        }
        return null;
    }
}
