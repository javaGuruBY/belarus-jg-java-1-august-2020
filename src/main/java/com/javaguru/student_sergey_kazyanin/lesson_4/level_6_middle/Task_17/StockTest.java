package com.javaguru.student_sergey_kazyanin.lesson_4.level_6_middle.Task_17;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.testMaxInit();
        stockTest.testMaxOneUpdatePrice();
        stockTest.testMaxOneUpdatePrice1();
        stockTest.testMaxTwoUpdatePrice();
        stockTest.testMaxThreeUpdatePrice();
//        TEST MIN
        System.out.println();
        stockTest.testMinInit();
        stockTest.testMinOneUpdatePrice();
        stockTest.testMinOneUpdatePrice1();
        stockTest.testMinTwoUpdatePrice();
        stockTest.testMinThreeUpdatePrice();

    }

    public void testMaxInit(){
        Stock stock = new Stock("Company", 999);
        int actualResult = stock.getMaxPrice();
        int expectedResult = 999;
        printResult(actualResult, expectedResult, "Init Max");
    }

    public void testMaxOneUpdatePrice() {
        Stock stock = new Stock("Company", 999);
        int priceOne = 1;

        stock.updatePrice(priceOne);

        int actualResult = stock.getMaxPrice();
        int expectedResult = 999;
        printResult(actualResult, expectedResult, "Max (One update price - degree)");
    }

    public void testMaxTwoUpdatePrice() {
        Stock stock = new Stock("Company", 999);
        int priceOne = 1;
        int priceTwo = 1000;

        stock.updatePrice(priceOne);
        stock.updatePrice(priceTwo);

        int actualResult = stock.getMaxPrice();
        int expectedResult = 1000;
        printResult(actualResult, expectedResult, "Max (Two update price)");
    }

    public void testMaxThreeUpdatePrice() {
        Stock stock = new Stock("Company", 999);
        int priceOne = 2;
        int priceTwo = 1000;
        int priceThree = 8;

        stock.updatePrice(priceOne);
        stock.updatePrice(priceTwo);
        stock.updatePrice(priceThree);

        int actualResult = stock.getMaxPrice();
        int expectedResult = 1000;
        printResult(actualResult, expectedResult, "Max (Three update price)");
    }

    public void testMaxOneUpdatePrice1() {
        Stock stock = new Stock("Company", 9);
        int priceOne = 27;

        stock.updatePrice(priceOne);

        int actualResult = stock.getMaxPrice();
        int expectedResult = 27;
        printResult(actualResult, expectedResult, "Max (One update price - increase)");
    }
//==============================TEST MIN==========================================

    public void testMinInit(){
        Stock stock = new Stock("Company", 10);
        int actualResult = stock.getMinPrice();
        int expectedResult = 10;
        printResult(actualResult, expectedResult, "Init Min");
    }

    public void testMinOneUpdatePrice() {
        Stock stock = new Stock("Company", 10);
        int priceOne = 12;

        stock.updatePrice(priceOne);

        int actualResult = stock.getMinPrice();
        int expectedResult = 10;
        printResult(actualResult, expectedResult, "Min (One update price - increase)");
    }

    public void testMinTwoUpdatePrice() {
        Stock stock = new Stock("Company", 10);
        int priceOne = 12;
        int priceTwo = 5;

        stock.updatePrice(priceOne);
        stock.updatePrice(priceTwo);

        int actualResult = stock.getMinPrice();
        int expectedResult = 5;
        printResult(actualResult, expectedResult, "Min (Two update price)");
    }

    public void testMinThreeUpdatePrice() {
        Stock stock = new Stock("Company", 10);
        int priceOne = 12;
        int priceTwo = 5;
        int priceThree = 99;

        stock.updatePrice(priceOne);
        stock.updatePrice(priceTwo);
        stock.updatePrice(priceThree);

        int actualResult = stock.getMinPrice();
        int expectedResult = 5;
        printResult(actualResult, expectedResult, "Min (Three update price)");
    }

    public void testMinOneUpdatePrice1() {
        Stock stock = new Stock("Company", 10);
        int priceOne = 2;

        stock.updatePrice(priceOne);

        int actualResult = stock.getMinPrice();
        int expectedResult = 2;
        printResult(actualResult, expectedResult, "Min (One update price - degree)");
    }
    public void printResult(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " test = PASSED");
        } else {
            System.out.println(testName + " test = FAILURE!!! actualResult = " + actualResult + " | expectedResult = " + expectedResult);
        }
    }
}
