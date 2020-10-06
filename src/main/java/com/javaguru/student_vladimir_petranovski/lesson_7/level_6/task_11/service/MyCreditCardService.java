package com.javaguru.student_vladimir_petranovski.lesson_7.level_6.task_11.service;

import com.javaguru.student_vladimir_petranovski.lesson_7.level_6.task_11.bean.MyCreditCard;

public class MyCreditCardService {

    public double deposit(MyCreditCard myCreditCard, int pin, double deposit) {
        if (isPin(myCreditCard, pin)) {
            return checkBalanceForIsLoanDebt(myCreditCard, deposit);
        }
        return myCreditCard.getBalance();
    }

    public double withdraw(MyCreditCard myCreditCard, int pin, double withdraw) {
        if (isPin(myCreditCard, pin)) {
            if (!isLoanDebtMoreCreditLimit(myCreditCard)) {
                return checkBalanceForNotLoanDebtMoreCreditLimit(myCreditCard, withdraw);
            }
        }
        return myCreditCard.getBalance();
    }

    boolean isPin(MyCreditCard myCreditCard, int userPin) {
        return myCreditCard.getPin() == userPin;
    }

    boolean isDebt(MyCreditCard myCreditCard){
        return myCreditCard.getLoanDebt() > 0;
    }

    double balanceForDeposit(MyCreditCard myCreditCard, double deposit) {
        return deposit - myCreditCard.getLoanDebt();
    }

    double checkBalanceForIsLoanDebt(MyCreditCard myCreditCard, double deposit) {
        if (isDebt(myCreditCard)) {
            return balanceForDeposit(myCreditCard, deposit);
        } else {
            return myCreditCard.getBalance() + deposit;
        }
    }

    boolean isLoanDebtMoreCreditLimit(MyCreditCard myCreditCard) {
        return myCreditCard.getLoanDebt() > myCreditCard.getCreditLimit();
    }

    double checkBalanceForNotLoanDebtMoreCreditLimit(MyCreditCard myCreditCard, double withdraw) {
        if (myCreditCard.getBalance() < withdraw) {
            return myCreditCard.getBalance() - withdraw + myCreditCard.getCreditLimit() - myCreditCard.getLoanDebt();
        }
        return myCreditCard.getBalance() - withdraw;
    }
}
