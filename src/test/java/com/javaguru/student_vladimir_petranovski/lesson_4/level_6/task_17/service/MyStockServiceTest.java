package com.javaguru.student_vladimir_petranovski.lesson_4.level_6.task_17.service;

import com.javaguru.student_vladimir_petranovski.lesson_4.level_6.task_17.bean.MyStock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyStockServiceTest {
    private MyStockService test;
    private MyStock stock;

    @Before
    public void setUp() {
        test = new MyStockService();
        stock = new MyStock("Shell", 10);
    }

    @Test
    public void updatePriceTestMaxPrice() {
        double[] newPrice = {12, 5, 7, 99, 77};
        double[] maxPrice = {12, 12, 12, 99, 99};
        double[] minPrice = {10, 5, 5, 5, 5};
        for (int i = 0; i < newPrice.length; i++) {
            test.updatePrice(stock, newPrice[i]);
            double actual = stock.getMaxPrice();
            assertEquals(maxPrice[i], actual, 0.1);
            double actualOne = stock.getMinPrice();
            assertEquals(minPrice[i], actualOne, 0.1);
        }
    }

    @Test
    public void getPriceInformationTest() {
        test.updatePrice(stock, 12);
        assertEquals("Company = Shell, Current Price = 12.0, Min Price = 10.0, Max Price = 12.0", test.getPriceInformation(stock));
    }
}