package com.javaguru.student_vladimir_petranovski.lesson_10.level_3.task_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryDatabase implements Database {
    private final List<Product> productList = new ArrayList<>();

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
       return Optional.ofNullable(findProduct(productTitle));
    }

    private Product findProduct(String productTitle) {
        for (Product product : productList) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }
}
