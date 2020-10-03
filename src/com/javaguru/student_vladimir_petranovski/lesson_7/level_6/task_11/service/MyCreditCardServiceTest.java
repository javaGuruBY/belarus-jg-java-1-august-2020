package com.javaguru.student_vladimir_petranovski.lesson_7.level_6.task_11.service;


import com.javaguru.student_vladimir_petranovski.lesson_7.level_6.task_11.bean.MyCreditCard;

class MyCreditCardServiceTest {
    private MyCreditCardService myCreditService = new MyCreditCardService();
    private MyCreditCard myCreditCard = new MyCreditCard(12345, 123);

    public static void main(String[] args) {
        MyCreditCardServiceTest test = new MyCreditCardServiceTest();
        test.isPinTestTrue();
        test.isPinTestFalse();

        test.isDebtTestTrue();
        test.isDebtTestFalse();

        test.balanceForDepositTestOne();
        test.balanceForDepositTestTwo();

        test.checkBalanceForIsLoanDebtTestOne();
        test.checkBalanceForIsLoanDebtTestTwo();

        test.depositTestOne();
        test.depositTestTwo();
        test.depositTestThree();

        test.isLoanDebtMoreCreditLimitFalse();
        test.isLoanDebtMoreCreditLimitTrue();

        test.checkBalanceForNotLoanDebtMoreCreditLimitTestOne();
        test.checkBalanceForNotLoanDebtMoreCreditLimitTestTwo();

        test.withdrawTestOne();
        test.withdrawTestTwo();
        test.withdrawTestThree();
    }

    void isPinTestTrue() {
        boolean expected = true;
        boolean actual = myCreditService.isPin(myCreditCard, 123);
        checkResult(expected == actual, "isPinTestTrue");
    }

    void isPinTestFalse() {
        boolean expected = false;
        boolean actual = myCreditService.isPin(myCreditCard, 312);
        checkResult(expected == actual, "isPinTestFalse");
    }

    void isDebtTestTrue() {
        myCreditCard.setLoanDebt(50);
        boolean expected = true;
        boolean actual = myCreditService.isDebt(myCreditCard);
        checkResult(expected == actual, "isDebtTestTrue");
    }

    void isDebtTestFalse() {
        myCreditCard.setLoanDebt(0);
        boolean expected = false;
        boolean actual = myCreditService.isDebt(myCreditCard);
        checkResult(expected == actual, "isDebtTestFalse");
    }

    void balanceForDepositTestOne() {
        myCreditCard.setLoanDebt(60);
        double expected = -10;
        double actual = myCreditService.balanceForDeposit(myCreditCard, 50);
        checkResult(expected == actual, "balanceForDepositTestOne");
    }

    void balanceForDepositTestTwo() {
        myCreditCard.setLoanDebt(60);
        double expected = 30;
        double actual = myCreditService.balanceForDeposit(myCreditCard, 90);
        checkResult(expected == actual, "balanceForDepositTestTwo");
    }

    void checkBalanceForIsLoanDebtTestOne() {
        myCreditCard.setLoanDebt(0);
        double expected = 50;
        double actual = myCreditService.checkBalanceForIsLoanDebt(myCreditCard, 50);
        checkResult(expected == actual, "checkBalanceForIsLoanDebtTestOne");
    }

    void checkBalanceForIsLoanDebtTestTwo() {
        myCreditCard.setLoanDebt(100);
        double expected = -50;
        double actual = myCreditService.checkBalanceForIsLoanDebt(myCreditCard, 50);
        checkResult(expected == actual, "checkBalanceForIsLoanDebtTestTwo");
    }

    void depositTestOne() {
        myCreditCard.setLoanDebt(100);
        double expected = 0;
        double actual = myCreditService.deposit(myCreditCard, 4546, 50);
        checkResult(expected == actual, "depositTestOne");
    }

    void depositTestTwo() {
        myCreditCard.setLoanDebt(0);
        double expected = 200;
        double actual = myCreditService.deposit(myCreditCard, 123, 200);
        checkResult(expected == actual, "depositTestTwo");
    }

    void depositTestThree() {
        myCreditCard.setLoanDebt(100);
        double expected = 100;
        double actual = myCreditService.deposit(myCreditCard, 123, 200);
        checkResult(expected == actual, "depositTestThree");
    }

    void isLoanDebtMoreCreditLimitTrue() {
        myCreditCard.setCreditLimit(50);
        myCreditCard.setLoanDebt(60);
        boolean expected = true;
        boolean actual = myCreditService.isLoanDebtMoreCreditLimit(myCreditCard);
        checkResult(expected == actual, "isLoanDebtMoreCreditLimitTrue");
    }

    void isLoanDebtMoreCreditLimitFalse() {
        myCreditCard.setCreditLimit(50);
        myCreditCard.setLoanDebt(40);
        boolean expected = false;
        boolean actual = myCreditService.isLoanDebtMoreCreditLimit(myCreditCard);
        checkResult(expected == actual, "isLoanDebtMoreCreditLimitFalse");
    }

    void checkBalanceForNotLoanDebtMoreCreditLimitTestOne() {
        myCreditCard.setLoanDebt(0);
        myCreditCard.setBalance(30);
        myCreditCard.setCreditLimit(30);
        double expected = 10;
        double actual = myCreditService.checkBalanceForNotLoanDebtMoreCreditLimit(myCreditCard, 50);
        checkResult(expected == actual, "checkBalanceForNotLoanDebtMoreCreditLimitTestOne");
    }

    void checkBalanceForNotLoanDebtMoreCreditLimitTestTwo() {
        myCreditCard.setBalance(30);
        myCreditCard.setCreditLimit(10);
        double expected = 20;
        double actual = myCreditService.checkBalanceForNotLoanDebtMoreCreditLimit(myCreditCard, 10);
        checkResult(expected == actual, "checkBalanceForNotLoanDebtMoreCreditLimitTestTwo");
    }

    void withdrawTestOne() {
        myCreditCard.setBalance(300);
        myCreditCard.setLoanDebt(0);
        myCreditCard.setCreditLimit(0);
        double expected = 0;
        double actual = myCreditService.withdraw(myCreditCard, 123, 300);
        checkResult(expected == actual, "withdrawTestOne");
    }

    void withdrawTestTwo() {
        myCreditCard.setBalance(0);
        myCreditCard.setLoanDebt(10);
        myCreditCard.setCreditLimit(100);
        double expected = 70;
        double actual = myCreditService.withdraw(myCreditCard, 123, 20);
        checkResult(expected == actual, "withdrawTestTwo");
    }

    void withdrawTestThree() {
        myCreditCard.setBalance(0);
        myCreditCard.setLoanDebt(400);
        myCreditCard.setCreditLimit(300);
        double expected = 0;
        double actual = myCreditService.withdraw(myCreditCard, 123, 300);
        checkResult(expected == actual, "withdrawTestThree");
    }

    void checkResult(boolean condition, String testName) {
        if(condition) {
            System.out.println(testName + " = SUCCESS");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }
}
