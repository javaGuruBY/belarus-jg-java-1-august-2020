package com.javaguru.student_Denis_Shlichkov.lesson_4.level_6_middle.task_17;

public class StockTest {
    public static void main(String[] args) {
        Stock stock = new Stock("Kettle", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        stock.getPriceInformation();
    }
}
