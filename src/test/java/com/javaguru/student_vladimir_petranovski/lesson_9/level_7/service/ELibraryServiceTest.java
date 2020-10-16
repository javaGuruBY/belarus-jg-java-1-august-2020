package com.javaguru.student_vladimir_petranovski.lesson_9.level_7.service;

import com.javaguru.student_vladimir_petranovski.lesson_9.level_7.bean.ELibrary;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ELibraryServiceTest {
    private ELibraryService test;
    private ELibrary eLibrary;
    private ArrayList<String> books;

    @Before
    public void setUp() {
        test = new ELibraryService();
        books = new ArrayList<>();
        books.add("Tom and Jerry");
        books.add("White Bim");
        books.add("Java in the beginning");
        books.add("Clean code");
        eLibrary = new ELibrary(books);
    }

    @Test
    public void searchBookInLibraryTest() {
        assertEquals("Вы нашли книгу White Bim.", test.searchBookInLibrary(books, "White Bim"));
    }

    @Test
    public void returnBookInLibraryTest() {
        ArrayList<String> expected = new ArrayList<>();
        expected.addAll(books);
        expected.set(0, "Java");
        assertEquals(expected, test.returnBookInLibrary(books, "Java"));
    }

    @Test
    public void getBookFromLibraryTest() {
        ArrayList<String> expected = new ArrayList<>();
        expected.addAll(books);
        expected.remove("Java in the beginning");
        assertEquals(expected, test.getBookFromLibrary(books, "Java in the beginning"));
    }

    @Test
    public void isBookInLibraryTestTrue() {
        assertEquals(true, test.isBookInLibrary(books, "Java in the beginning"));
    }

    @Test
    public void isBookInLibraryTestFalse() {
        assertEquals(false, test.isBookInLibrary(books, "Space"));
    }

    @Test
    public void isBookReservedTestTrue() {
        assertEquals(true, test.isBookReserved(books, "White Bim"));
    }

    @Test
    public void isBookReservedTestFalse() {
        assertEquals(false, test.isBookReserved(books, "Space"));
    }

    @Test
    public void deliveryDateTest() {
        assertEquals("Deadline this book 7 days.", test.deliveryDate(eLibrary));
    }

    @Test
    public void fineTestOne() {
        eLibrary.setDayOfDelay(22);
        assertEquals(300, test.fine(eLibrary), 0.01);
    }

    @Test
    public void fineTestTwo() {
        eLibrary.setDayOfDelay(19);
        assertEquals(200, test.fine(eLibrary), 0.01);
    }

    @Test
    public void fineTestThree() {
        eLibrary.setDayOfDelay(9);
        assertEquals(100, test.fine(eLibrary), 0.01);
    }

    @Test
    public void addBookInLibraryTest() {
        ArrayList<String> expected = new ArrayList<>();
        expected.addAll(books);
        expected.add(0, "Java Core");
        assertEquals(expected, test.addBookInLibrary(books, "Java Core"));
    }
}