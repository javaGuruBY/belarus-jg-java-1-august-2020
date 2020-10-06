package com.javaguru.student_vladimir_petranovski.lesson_7.level_6.task_11_2;

class CreditCardServiceTest {
    private CreditCardService creditCardService = new CreditCardService();
    private CreditCard creditCard = new CreditCard(12345, 54321);

    public static void main(String[] args) {
        CreditCardServiceTest test = new CreditCardServiceTest();
        test.isPinTestTrue();
        test.isPinTestFalse();

        test.isDebtEqualsZeroTrue();
        test.isDebtEqualsZeroFalse();

        test.depositTestOne();
        test.depositTestTwo();
        test.depositTestThree();

        test.isDebtEqualsZeroTrue();
        test.isDebtEqualsZeroFalse();

        test.isWithdrawMoreBalanceTestTrue();
        test.isWithdrawMoreBalanceTestFalse();

        test.withdrawTestOne();
        test.withdrawTestTwo();
        test.withdrawTestThree();
    }

    void isPinTestTrue() {
        boolean expected = true;
        boolean actual = creditCardService.isPin(creditCard, 54321);
        checkResult(expected == actual, "isPinTestTrue");
    }

    void isPinTestFalse() {
        boolean expected = false;
        boolean actual = creditCardService.isPin(creditCard, 312);
        checkResult(expected == actual, "isPinTestFalse");
    }

    void isDebtEqualsZeroTrue() {
        creditCard.setLoanDebt(0);
        boolean expected = true;
        boolean actual = creditCardService.isDebtEqualsZero(creditCard);
        checkResult(expected == actual, "isDebtEqualsZeroTrue");
    }

    void isDebtEqualsZeroFalse() {
        creditCard.setLoanDebt(100);
        boolean expected = false;
        boolean actual = creditCardService.isDebtEqualsZero(creditCard);
        checkResult(expected == actual, "isDebtEqualsZeroFalse");
    }

    void depositTestOne() {
        creditCard.setLoanDebt(0);
        boolean expected = false;
        boolean actual = creditCardService.deposit(creditCard, 345, 300);
        checkResult(expected == actual, "depositTestOne");
    }

    void depositTestTwo() {
        creditCard.setLoanDebt(100);
        boolean expected = true;
        boolean actual = creditCardService.deposit(creditCard, 54321, 400);
        checkResult(expected == actual, "depositTestTwo");
    }

    void depositTestThree() {
        creditCard.setLoanDebt(0);
        boolean expected = true;
        boolean actual = creditCardService.deposit(creditCard, 54321, 500);
        checkResult(expected == actual, "depositTestThree");
    }

    void isDebtMoreCreditLimitTestTrue() {
        creditCard.setLoanDebt(100);
        creditCard.setCreditLimit(50);
        boolean expected = true;
        boolean actual = creditCardService.isDebtMoreCreditLimit(creditCard);
        checkResult(expected == actual, "isDebtMoreCreditLimitTestTrue");
    }

    void isDebtMoreCreditLimitTestFalse() {
        creditCard.setLoanDebt(10);
        creditCard.setCreditLimit(50);
        boolean expected = false;
        boolean actual = creditCardService.isDebtMoreCreditLimit(creditCard);
        checkResult(expected == actual, "isDebtMoreCreditLimitTestFalse");
    }

    void isWithdrawMoreBalanceTestTrue() {
        creditCard.setBalance(100);
        double withdraw = 150;
        boolean expected = true;
        boolean actual = creditCardService.isWithdrawMoreBalance(creditCard, withdraw);
        checkResult(expected == actual, "isWithdrawMoreBalanceTestTrue");
    }

    void isWithdrawMoreBalanceTestFalse() {
        creditCard.setBalance(100);
        double withdraw = 50;
        boolean expected = false;
        boolean actual = creditCardService.isWithdrawMoreBalance(creditCard, withdraw);
        checkResult(expected == actual, "isWithdrawMoreBalanceTestFalse");
    }

    void withdrawTestOne() {
        creditCard.setLoanDebt(0);
        creditCard.setCreditLimit(100);
        creditCard.setBalance(200);
        boolean expected = false;
        boolean actual = creditCardService.withdraw(creditCard, 345, 300);
        checkResult(expected == actual, "withdrawTestOne");
    }

    void withdrawTestTwo() {
        creditCard.setLoanDebt(1000);
        creditCard.setCreditLimit(100);
        creditCard.setBalance(200);
        boolean expected = false;
        boolean actual = creditCardService.withdraw(creditCard, 54321, 300);
        checkResult(expected == actual, "withdrawTestTwo");
    }

    void withdrawTestThree() {
        creditCard.setLoanDebt(70);
        creditCard.setCreditLimit(100);
        creditCard.setBalance(200);
        boolean expected = true;
        boolean actual = creditCardService.withdraw(creditCard, 54321, 300);
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
