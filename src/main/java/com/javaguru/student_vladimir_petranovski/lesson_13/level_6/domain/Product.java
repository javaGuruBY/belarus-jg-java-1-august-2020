package com.javaguru.student_vladimir_petranovski.lesson_13.level_6.domain;

import java.util.Objects;

public class Product {

    private String nameProduct;
    private Integer priceProduct;
    private String descriptionProduct;

    public Product(String nameProduct, Integer priceProduct, String descriptionProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.descriptionProduct = descriptionProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(nameProduct, product.nameProduct) &&
                Objects.equals(priceProduct, product.priceProduct) &&
                Objects.equals(descriptionProduct, product.descriptionProduct);
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", descriptionProduct='" + descriptionProduct + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct, priceProduct, descriptionProduct);
    }
}
