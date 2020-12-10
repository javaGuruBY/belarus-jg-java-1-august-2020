package com.javaguru.student_vladimir_petranovski.lesson_15.level_6.videostore;

import junit.framework.TestCase;

public class CustomerTest extends TestCase {

    private final Movie movie1 = new Movie("AAA", "REGULAR");
    private final Movie movie2 = new Movie("BBB", "NEW_RELEASE");
    private final Movie movie3 = new Movie("CCC", "CHILDRENS");

    private final Rental rental1 = new Rental(movie1, 2);
    private final Rental rental12 = new Rental(movie1, 10);
    private final Rental rental2 = new Rental(movie2, 1);
    private final Rental rental22 = new Rental(movie2, 5);
    private final Rental rental3 = new Rental(movie3, 3);
    private final Rental rental32 = new Rental(movie3, 20);

    public void testStatementForMovie1Rental1() {
        Customer test1 = new Customer("REGULAR");
        test1.addRental(rental1);
        assertEquals("Rental Record for REGULAR\n" +
                "\tAAA\t2.0\n" +
                "You owed 2.0\n" +
                "You earned 1 frequent renter points\n", test1.statement());
    }

    public void testStatementForMovie1Rental12() {
        Customer test12 = new Customer("REGULAR");
        test12.addRental(rental12);
        assertEquals("Rental Record for REGULAR\n" +
                "\tAAA\t14.0\n" +
                "You owed 14.0\n" +
                "You earned 1 frequent renter points\n", test12.statement());
    }

    public void testStatementForMovie2Rental22() {
        Customer test22 = new Customer("NEW_RELEASE");
        test22.addRental(rental22);
        assertEquals("Rental Record for NEW_RELEASE\n" +
                "\tBBB\t15.0\n" +
                "You owed 15.0\n" +
                "You earned 2 frequent renter points\n", test22.statement());
    }

    public void testStatementForMovie2Rental2() {
        Customer test2 = new Customer("NEW_RELEASE");
        test2.addRental(rental2);
        assertEquals("Rental Record for NEW_RELEASE\n" +
                "\tBBB\t3.0\n" +
                "You owed 3.0\n" +
                "You earned 1 frequent renter points\n", test2.statement());
    }

    public void testStatementForMovie3Rental3() {
        Customer test3 = new Customer("CHILDRENS");
        test3.addRental(rental3);
        assertEquals("Rental Record for CHILDRENS\n" +
                "\tCCC\t1.5\n" +
                "You owed 1.5\n" +
                "You earned 1 frequent renter points\n", test3.statement());
    }

    public void testStatementForMovie3Rental32() {
        Customer test32 = new Customer("CHILDRENS");
        test32.addRental(rental32);
        assertEquals("Rental Record for CHILDRENS\n" +
                "\tCCC\t27.0\n" +
                "You owed 27.0\n" +
                "You earned 1 frequent renter points\n", test32.statement());
    }
}