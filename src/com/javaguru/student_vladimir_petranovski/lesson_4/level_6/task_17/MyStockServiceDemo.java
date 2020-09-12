package com.javaguru.student_vladimir_petranovski.lesson_4.level_6.task_17;

import com.javaguru.student_vladimir_petranovski.lesson_4.level_6.task_17.bean.MyStock;
import com.javaguru.student_vladimir_petranovski.lesson_4.level_6.task_17.service.MyStockService;

public class MyStockServiceDemo {
    public static void main(String[] args) {
        MyStock stock = new MyStock("Makdonalds", 372.0);
        MyStockService stockService = new MyStockService();
        stockService.updatePrice(stock, 89);
        System.out.println(stockService.getPriceInformation(stock));
        stockService.updatePrice(stock, 451);
        System.out.println(stockService.getPriceInformation(stock));
        stockService.updatePrice(stock, 253);
        System.out.println(stockService.getPriceInformation(stock));
    }
}
