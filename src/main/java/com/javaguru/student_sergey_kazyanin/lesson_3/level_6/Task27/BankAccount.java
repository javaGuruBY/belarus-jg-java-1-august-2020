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
package com.javaguru.student_sergey_kazyanin.lesson_3.level_6.Task27;

class BankAccount {

    private String owner;
    private int money;

    public BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    public String getOwner() {
        return this.owner;
    }

    public String getMoney() {
        String s = String.valueOf(this.money);
        return s;
    }
}

class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        String moneyAmount = bankAccount.getMoney();
//      По условию задачи, менять здесь ничего нельзя, но переменные названы неправильно, это ошибка задания?
//        System.out.println("Owner = " + owner);
//        System.out.println("Money = " + money);
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }
}