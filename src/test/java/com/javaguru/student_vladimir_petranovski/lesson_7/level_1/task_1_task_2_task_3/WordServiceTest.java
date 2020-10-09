package com.javaguru.student_vladimir_petranovski.lesson_7.level_1.task_1_task_2_task_3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static com.javaguru.student_vladimir_petranovski.lesson_7.level_1.task_1_task_2_task_3.WordService.*;

public class WordServiceTest {
    private WordService test;

    @Before
    public void setUp() {
        test = new WordService();
    }

    @Test
    public void findMostFrequentWordTest() {
        assertEquals("ha", test.findMostFrequentWord("Mama Ha, mila ha, ramu! ha!"));
    }

    @Test
    public void divideStringByArrayWordTest() {
        String text = "Ha, ha ha!";
        String[] arr = {"ha", "ha", "ha"};
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], divideStringByArrayWord(text)[i]);
        }
    }

    @Test
    public void fillArrayIntegerForCountEachWordTest() {
        String text = "Mama Ha, mila ha, ramu! ha!";
        int[] arr = {1, 3, 1, 3, 1, 3};
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], fillArrayIntegerForCountEachWord(text)[i]);
        }
    }

    @Test
    public void foundMaxAmountRepeatWordOnIndexTest() {
        assertEquals(1, foundMaxAmountRepeatWordOnIndex("Mama Ha, mila ha, ramu! ha!"));
    }
}