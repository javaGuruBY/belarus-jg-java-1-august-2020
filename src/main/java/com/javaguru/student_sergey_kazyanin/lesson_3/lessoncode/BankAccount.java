package com.javaguru.student_sergey_kazyanin.lesson_3.lessoncode;

class BankAccount {
    private String ownerName;
    private double balance; //BigDecimal - для денег лучше использовать этот класс

    public void deposit(double amount){
        balance +=amount;
    }

    public BankAccount(String ownerName, double balance){
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void printInformation(){
        System.out.println("Print balance: " + balance);
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }

}
