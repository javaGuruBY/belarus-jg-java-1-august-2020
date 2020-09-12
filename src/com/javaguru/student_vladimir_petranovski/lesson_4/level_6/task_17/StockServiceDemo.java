package com.javaguru.student_vladimir_petranovski.lesson_4.level_6.task_17;

import com.javaguru.student_vladimir_petranovski.lesson_4.level_6.task_17.bean.Stock;
import com.javaguru.student_vladimir_petranovski.lesson_4.level_6.task_17.service.StockService;

class StockServiceDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("Makdonalds", 372.0);
        StockService stockService = new StockService();
        stockService.updatePrice(stock, 89);
        System.out.println(stockService.getPriceInformation(stock));
        stockService.updatePrice(stock, 451);
        System.out.println(stockService.getPriceInformation(stock));
        stockService.updatePrice(stock, 253);
        System.out.println(stockService.getPriceInformation(stock));
    }
}
