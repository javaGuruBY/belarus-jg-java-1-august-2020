package com.javaguru.student_vladimir_petranovski.lesson_10.level_3.task_8;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InMemoryDatabaseTest {
    private InMemoryDatabase test;
    private Product product;

    @Before
    public void setUp() {
        test = new InMemoryDatabase();
        product = new Product("Apples");
        test.save(product);
    }

    @Test
    public void saveTest() {
        boolean expected = test.getProducts().contains(product);
        assertTrue(expected);
    }

    @Test
    public void findByTitleTestFind() {
        assertEquals(product, test.findByTitle("Apples"));
    }

    @Test
    public void findByTitleTestDoesntFind() {
        assertEquals(null, test.findByTitle("Oranges"));
    }
}