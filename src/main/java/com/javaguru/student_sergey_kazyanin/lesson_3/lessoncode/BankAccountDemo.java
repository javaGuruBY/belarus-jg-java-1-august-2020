package com.javaguru.student_sergey_kazyanin.lesson_3.lessoncode;

class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Sergey", 10.0);
        bankAccount.deposit(100);
        bankAccount.printInformation();

        bankAccount.deposit(40);
        bankAccount.printInformation();

        bankAccount.withdraw(1000);
        bankAccount.printInformation();
    }
}
