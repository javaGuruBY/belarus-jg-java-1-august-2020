package com.javaguru.teacher.lesson_3.lessoncode;

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Vasya");
        bankAccount.deposit(100);
        bankAccount.printInformation();

        bankAccount.deposit(10000);
        bankAccount.deposit(30);

        bankAccount.printInformation();

        bankAccount.withdraw(300000);
        bankAccount.withdraw(300000);
        bankAccount.withdraw(300000);
        bankAccount.printInformation();
    }
}
