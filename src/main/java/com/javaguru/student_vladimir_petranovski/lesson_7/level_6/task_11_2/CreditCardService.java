package com.javaguru.student_vladimir_petranovski.lesson_7.level_6.task_11_2;

class CreditCardService {
    boolean deposit(CreditCard creditCard, int pin, double deposit) {
        if (!isPin(creditCard, pin)) {
            return false;
        } else if (!isDebtEqualsZero(creditCard)) {
            return true;
        }
        return true;
    }

    boolean isPin(CreditCard creditCard, int userPin) {
        return creditCard.getPin() == userPin;
    }

    boolean isDebtEqualsZero(CreditCard creditCard) {
        return creditCard.getLoanDebt() == 0;
    }

    boolean withdraw(CreditCard creditCard, int pin, double withdraw) {
        if (!isPin(creditCard, pin) || (isDebtMoreCreditLimit(creditCard))) {
            return false;
        } if (isWithdrawMoreBalance(creditCard, withdraw)) {
            return true;
        }
        return true;
    }

    boolean isDebtMoreCreditLimit(CreditCard creditCard) {
        return creditCard.getLoanDebt() > creditCard.getCreditLimit();
    }

    boolean isWithdrawMoreBalance(CreditCard creditCard, double withdraw) {
        return withdraw > creditCard.getBalance();
    }


}
