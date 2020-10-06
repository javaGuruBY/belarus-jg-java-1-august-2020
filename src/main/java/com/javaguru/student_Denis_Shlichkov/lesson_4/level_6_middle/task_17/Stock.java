package com.javaguru.student_Denis_Shlichkov.lesson_4.level_6_middle.task_17;

class Stock {
    String nameCompany;
    int currentPrice;
    int maxPrice;
    int minPrice;
    Stock (String nameCompany, int currentPrice) {
        this.currentPrice = currentPrice;
        this.nameCompany = nameCompany;
        maxPrice = currentPrice;
        minPrice = currentPrice;
    }

    void updatePrice(int currentPrice) {
        if (currentPrice > maxPrice) {
            maxPrice = currentPrice;
        }
        if (currentPrice < minPrice) {
            minPrice = currentPrice;
        }
    }
    void getPriceInformation() {
        System.out.println("Company : " + nameCompany + ";  Current price = " + currentPrice +
                ";  Maximum price = " + maxPrice + ";  Minimum price = " + minPrice);
    }

}
