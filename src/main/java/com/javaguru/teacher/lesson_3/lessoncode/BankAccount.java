package com.javaguru.teacher.lesson_3.lessoncode;

class BankAccount {

    private String ownerName;
    private double balance; //BigDecimal

    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void printInformation() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
    }

}
