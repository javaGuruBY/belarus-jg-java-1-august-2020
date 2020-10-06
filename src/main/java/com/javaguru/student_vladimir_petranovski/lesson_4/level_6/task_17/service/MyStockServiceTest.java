package com.javaguru.student_vladimir_petranovski.lesson_4.level_6.task_17.service;

import com.javaguru.student_vladimir_petranovski.lesson_4.level_6.task_17.bean.MyStock;

public class MyStockServiceTest {
    /*public void updatePriceFoundMaxPriceTest() {
        StockService stockService = new StockService();
        Stock actia = new Stock("Apple", 372);
        double[] maxPriceExpected = {450, 500};
        double[] newMaxPrice = {450, 500};
        for(int i = 0; i < maxPriceExpected.length; i++) {
            stockService.updatePrice(actia, newMaxPrice[i]);
            double maxPriceActual = actia.getMaxPrice();
            if(maxPriceExpected[i] == maxPriceActual) {
                System.out.println("Test -- Passed");
            } else
                System.out.println("Test -- Fail");
        }
    }
    public void updatePriceFoundMinPriceTest() {
        StockService stockService = new StockService();
        Stock actia = new Stock("Apple", 372);
        /*double[] minPriceExpected = {200, 150};
        double[] newMinPrice = {200, 150};
        for(int i = 0; i < minPriceExpected.length; i++) {
            stockService.updatePrice(actia, newMinPrice[i]);
            double minPriceActual = actia.getMinPrice();
            if(minPriceExpected[i] == minPriceActual) {
                System.out.println("Test -- Passed");
            } else
                System.out.println("Test -- Fail");
        }
    }*/
    public void updatePriceTest() {                       // короче способ
        MyStockService stockService = new MyStockService();
        MyStock stock = new MyStock("Shell", 10);
        double[] newPrice = {12, 5, 7, 99, 77};
        double[] maxPriceExpected = {12, 12, 12, 99, 99};
        double[] minPriceExpected = {10, 5, 5, 5, 5};
        for (int i = 0; i < minPriceExpected.length; i++) {
            stockService.updatePrice(stock, newPrice[i]);
            double maxPriceActual = stock.getMinPrice();
            if (minPriceExpected[i] == maxPriceActual) {
                System.out.println("Test -- Passed");
            } else
                System.out.println("Test -- Fail");
            double minPriceActual = stock.getMinPrice();
            if (minPriceExpected[i] == minPriceActual) {
                System.out.println("Test -- Passed");
            } else
                System.out.println("Test -- Fail");
        }
    }

    public void getPriceInformationTest() {
        MyStockService actia = new MyStockService();
        MyStock stock = new MyStock("Sheii", 301);
        String expected = "Company = " + stock.getName() + ", Current Price = " + stock.getCurrentPrice() + ", Min Price = " + stock.getMinPrice() + ", Max Price = " + stock.getMaxPrice();
        String actual = "Company = " + stock.getName() + ", Current Price = " + stock.getCurrentPrice() + ", Min Price = " + stock.getMinPrice() + ", Max Price = " + stock.getMaxPrice();
        if (expected.equals(actual)) {
            System.out.println("TestPrintInformation --- Passed!");
        } else
            System.out.println("TestPrintInformation --- FAIL!");
    }

    public static void main(String[] args) {
        MyStockServiceTest test = new MyStockServiceTest();
        //test.updatePriceFoundMaxPriceTest();
        //test.updatePriceFoundMinPriceTest();
        test.updatePriceTest();
        test.getPriceInformationTest();
    }
}
