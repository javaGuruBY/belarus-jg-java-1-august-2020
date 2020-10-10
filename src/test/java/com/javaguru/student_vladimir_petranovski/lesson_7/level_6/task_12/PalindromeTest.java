package com.javaguru.student_vladimir_petranovski.lesson_7.level_6.task_12;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    private Palindrome test;

    @Before
    public void setUp() {
        test =new Palindrome();
    }

    @Test
    public void isPalindromeTestFalseOne() {
        assertEquals(false, test.isPalindrome(null));
    }

    @Test
    public void isPalindromeTestFalseTwo() {
        assertEquals(false, test.isPalindrome("Mama mila ramu"));
    }

    @Test
    public void isPalindromeTestTrueOne() {
        assertEquals(true, test.isPalindrome("Mama, imi! amam."));
    }

    @Test
    public void isPalindromeTestTrueTwo() {
        assertEquals(true, test.isPalindrome("ahha"));
    }
}