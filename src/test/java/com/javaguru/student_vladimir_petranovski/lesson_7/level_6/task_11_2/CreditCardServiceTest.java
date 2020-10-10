package com.javaguru.student_vladimir_petranovski.lesson_7.level_6.task_11_2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardServiceTest {
    private CreditCardService test;
    private CreditCard creditCard;

    @Before
    public void setUp() {
        test = new CreditCardService();
        creditCard = new CreditCard(12345, 54321);
    }

    @Test
    public void depositTestFalseOne() {
        assertEquals(false, test.deposit(creditCard, 76234, 50));
    }

    @Test
    public void depositTestTrueOne() {
        creditCard.setLoanDebt(50);
        assertEquals(true, test.deposit(creditCard, 54321, 50));
    }

    @Test
    public void depositTestTrueTwo() {
        assertEquals(true, test.deposit(creditCard, 54321, 50));
    }

    @Test
    public void isPinTestTrue() {
        assertEquals(true, test.isPin(creditCard, 54321));
    }

    @Test
    public void isPinTestFalse() {
        assertEquals(false, test.isPin(creditCard, 12345));
    }

    @Test
    public void isDebtEqualsZeroTestTrue() {
        creditCard.setLoanDebt(0);
        assertEquals(true, test.isDebtEqualsZero(creditCard));
    }

    @Test
    public void isDebtEqualsZeroTestFalse() {
        creditCard.setLoanDebt(50);
        assertEquals(false, test.isDebtEqualsZero(creditCard));
    }

    @Test
    public void withdrawTestFalseOne() {
        assertEquals(false, test.withdraw(creditCard, 12345, 100));
    }

    @Test
    public void withdrawTestFalseTwo() {
        creditCard.setLoanDebt(100);
        creditCard.setCreditLimit(50);
        assertEquals(false, test.withdraw(creditCard, 54321, 100));
    }

    @Test
    public void withdrawTestTrueOne() {
        creditCard.setLoanDebt(50);
        creditCard.setCreditLimit(100);
        assertEquals(true, test.withdraw(creditCard, 54321, 100));
    }

    @Test
    public void withdrawTestTrueTwo() {
        creditCard.setLoanDebt(0);
        creditCard.setCreditLimit(0);
        assertEquals(true, test.withdraw(creditCard, 54321, 100));
    }

    @Test
    public void isDebtMoreCreditLimitTestTrue() {
        creditCard.setLoanDebt(100);
        creditCard.setCreditLimit(90);
        assertEquals(true, test.isDebtMoreCreditLimit(creditCard));
    }

    @Test
    public void isDebtMoreCreditLimitTestFalse() {
        creditCard.setLoanDebt(50);
        creditCard.setCreditLimit(70);
        assertEquals(false, test.isDebtMoreCreditLimit(creditCard));
    }

    @Test
    public void isWithdrawMoreBalanceTestTrue() {
        creditCard.setBalance(0);
        assertEquals(true, test.isWithdrawMoreBalance(creditCard, 10));
    }

    @Test
    public void isWithdrawMoreBalanceTestFalse() {
        creditCard.setBalance(70);
        assertEquals(false, test.isWithdrawMoreBalance(creditCard, 10));
    }
}