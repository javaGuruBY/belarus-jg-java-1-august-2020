package com.javaguru.student_vladimir_petranovski.lesson_7.level_6.task_11_2;

class CreditCard {
    private final int numberCard;
    private final int pin;
    private double balance;
    private double creditLimit;
    private double loanDebt;

    public CreditCard(int numberCard, int pin) {
        this.numberCard = numberCard;
        this.pin = pin;
        this.balance = 0;
        this.loanDebt = 0;
        this.creditLimit = 0;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getLoanDebt() {
        return loanDebt;
    }

    public void setLoanDebt(double loanDebt) {
        this.loanDebt = loanDebt;
    }

    @Override
    public String toString() {
        return "MyCreditCard{" +
                "numberCard=" + numberCard +
                ", pin=" + pin +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", loanDebt=" + loanDebt +
                '}';
    }
}
