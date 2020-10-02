package com.javaguru.student_vladimir_petranovski.lesson_7.level_6.task_11.bean;
/*
Необходимо разработать класс "кредитная карта" CreditCard
с учетом инкапсуляции, которая обладает следующими характеристиками:

Свойства
-Номер карты
-Пин-код карты
-Баланс
-Кредитный лимит
-Задолженность по кредиту


Методы

-Зачисление средств на карту ("deposit")
-Снятие средств с карты ("withdraw")

При создании карты нужно указывать ее номер и пинкод.
Начальный баланс и задолженность по кредиту равны 0.
Кредитный лимит можно менять после создания карты.

Требования к снятию средств:
-При снятии средств с карты необходимо указывать пин-код и желаемую сумму;
-Если пин-коды не совпадают, операция по снятию денег должна быть отклонена;
-Деньги снимаются с карточного баланса. В случае, если их не хватает, остаток суммы нужно брать за счет задолженности по кредиту;
-Если сумма задолженности превышает кредитный лимит, операция по снятию денег должна быть отклонена;

Требования к зачислению средств:
-При зачислении средств на карту необходимо указывать пин-код и желаемую сумму;
-Если пин-коды не совпадают, операция по зачислению денег должна быть отклонена;
-В первую очередь зачисление покрывает задолженность по кредиту;
-Если задолженность по кредиту равна 0, то остаток средств зачисляется в счет баланса;

Написать тестовые сценарии для класса CreditCard в классе CreditCardTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */

import java.util.Objects;

public class MyCreditCard {
    private final int numberCard;
    private final int pin;
    private double balance;
    private double creditLimit;
    private double loanDebt;

    public MyCreditCard(int numberCard, int pin) {
        this.numberCard = numberCard;
        this.pin = pin;
        this.balance = 0;
        this.loanDebt = 0;
        this.creditLimit = 200;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyCreditCard that = (MyCreditCard) o;
        return numberCard == that.numberCard &&
                pin == that.pin &&
                Double.compare(that.balance, balance) == 0 &&
                Double.compare(that.creditLimit, creditLimit) == 0 &&
                Double.compare(that.loanDebt, loanDebt) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberCard, pin, balance, creditLimit, loanDebt);
    }
}
