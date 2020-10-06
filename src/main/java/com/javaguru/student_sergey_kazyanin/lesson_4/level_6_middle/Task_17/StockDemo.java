/*
 Stock google = new Stock("GOOG", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
        ​google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);
        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
 */

package com.javaguru.student_sergey_kazyanin.lesson_4.level_6_middle.Task_17;

class StockDemo {
    public static void main(String[] args) {
        Stock google = new Stock("Goog", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);
        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }
}
