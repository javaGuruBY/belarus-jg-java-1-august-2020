package com.javaguru.student_vadim_migun.training;

class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName){
        this.ownerName = ownerName;
    }

    public void deposit (double amount){
        balance = balance + amount;
    }

    public void withdraw (double amount){
        balance -= amount;
    }

    public void printInformation(){
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
    }


}


class BankAccountDemo{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Vasya");
        bankAccount.deposit(100);

        bankAccount.printInformation();

        bankAccount.deposit(10000);
        bankAccount.deposit(30);

        bankAccount.printInformation();

        bankAccount.withdraw(5000);
        bankAccount.printInformation();

    }

}