/*
Найти логическую ошибку в коде.
Исправить и запустить программу так, что бы она выводила
на консоль владельца банковского счёта и количество денег.
Менять можно только класс BankAccount.

class BankAccount {

    private String owner;
    private int money;

    public BankAccount(int moneyAmount) {
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }

    public void getMoney() {
        return this.money;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        String moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
    }

}
 */
package com.javaguru.student_Denis_Shlichkov.lesson_3.level_6.task_27;

class Task_27 {
}
class BankAccount {

    private String owner;
    private int money;

    public BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        money = moneyAmount;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getMoney() {
        return this.money;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney(); //изменён String на int
        //всё же нужно поменять две строки ниже, хоть это и противоречит условию задачи
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }

}
