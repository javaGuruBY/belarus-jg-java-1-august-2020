package com.javaguru.student_vladimir_petranovski.lesson_4.level_6.task_17.service;

import com.javaguru.student_vladimir_petranovski.lesson_4.level_6.task_17.bean.Stock;

public class StockService {
    public void updatePrice(Stock stock, double newPrice) {
        stock.setCurrentPrice(newPrice);
        if(stock.getMinPrice() > newPrice) {
            stock.setMinPrice(newPrice);
        } else if(stock.getMaxPrice() < newPrice) {
            stock.setMaxPrice(newPrice);
        }

    }
    public String getPriceInformation(Stock stock) {
        String information = "Company = " + stock.getName() + ", Current Price = " + stock.getCurrentPrice() + ", Min Price = " + stock.getMinPrice() + ", Max Price = " + stock.getMaxPrice();
        return information;

    }
}
