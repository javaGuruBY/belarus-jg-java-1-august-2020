package com.javaguru.student_vladimir_petranovski.lesson_4.level_6.task_17.service;

import com.javaguru.student_vladimir_petranovski.lesson_4.level_6.task_17.bean.MyStock;

public class MyStockService {
    public void updatePrice(MyStock stock, double newPrice) {
        stock.setCurrentPrice(newPrice);
        if (stock.getMinPrice() > newPrice) {
            stock.setMinPrice(newPrice);
        } else if (stock.getMaxPrice() < newPrice) {
            stock.setMaxPrice(newPrice);
        }

    }

    public String getPriceInformation(MyStock stock) {
        String information = "Company = " + stock.getName() + ", Current Price = " + stock.getCurrentPrice() + ", Min Price = " + stock.getMinPrice() + ", Max Price = " + stock.getMaxPrice();
        return information;

    }
}
