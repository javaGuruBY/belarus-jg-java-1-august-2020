package com.javaguru.student_vladimir_petranovski.lesson_10.level_3.task_10;

import junit.framework.TestCase;
import org.junit.Before;

import java.util.Optional;

public class InMemoryDatabaseTest extends TestCase {
    private InMemoryDatabase test;
    private Product product;

    @Before
    public void setUp() {
        test = new InMemoryDatabase();
        product = new Product("Orange");
        test.save(product);
    }

    public void testSave() {
        boolean expected = test.getProductList().contains(product);
        assertTrue(expected);
    }

    public void testFindByTitleTestNotNull() {
        assertEquals(product, test.findByTitle("Orange").get());
    }

    public void testFindByTitleNull() {
        assertEquals(false, test.findByTitle("Apples").isPresent());
    }

}