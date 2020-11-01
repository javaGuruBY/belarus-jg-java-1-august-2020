package com.javaguru.student_vladimir_petranovski.lesson_10.level_6.service;

import com.javaguru.student_vladimir_petranovski.lesson_10.level_6.bean.Book;
import com.javaguru.student_vladimir_petranovski.lesson_10.level_6.bean.ElLibrary;
import junit.framework.TestCase;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

public class BookReaderImpTest extends TestCase {
    private BookReaderImp test;
    private Book book;

    @Before
    public void setUp() {
        ElLibrary elLibrary = new ElLibrary();
        test = new BookReaderImp(elLibrary);
        book = new Book("Tom", "Tim");
        List<Book> books = new ArrayList<>();
        elLibrary.fillLibrary(book);

    }


    public void testAddBookInLibraryTrue() {
        assertTrue(test.addBookInLibrary("Tom", "Jhon"));
    }

    public void testAddBookInLibraryFalse() {
        assertFalse(test.addBookInLibrary("Tom", "Tim"));
    }

    public void testIsExistBookTrue() {
        assertTrue(test.isExistBook("Tom", "Tim"));
    }

    public void testIsExistBookFalse() {
        assertFalse(test.isExistBook("Tom", "Mit"));
    }

    public void testAddBookAfterCheckNameAndNameAuthor() {
        assertFalse(test.addBookAfterCheckNameAndNameAuthor(" ", "John"));
    }

    public void testRemoveBookFromLibraryTrue() {
        assertTrue(test.removeBookFromLibrary("Tom", "Tim"));
    }

    public void testRemoveBookFromLibraryFalse() {
        assertFalse(test.removeBookFromLibrary("Tim", "Tim"));
    }

    public void testFindBookOnAuthor() {
        List<Book> expected = new ArrayList<>();
        expected.add(book);
        assertEquals(expected, test.findBookOnAuthor("tim"));
    }

    public void testFindBookOnAuthorFirstWord() {
        Book bookOne = new Book("Tom and Jerry", "Tim Silvia");
        List<Book> expected = new ArrayList<>();
        expected.add(bookOne);
        assertEquals(expected, test.findBookOnAuthorFirstWord(bookOne, "tim"));
    }

    public void testFindBookOnName() {
        List<Book> expected = new ArrayList<>();
        expected.add(book);
        assertEquals(expected, test.findBookOnName("tom"));
    }

    public void testFindBookOnNameFirstWord() {
        Book bookOne = new Book("Tom and Jerry", "Tim Silvia");
        List<Book> expected = new ArrayList<>();
        expected.add(bookOne);
        assertEquals(expected, test.findBookOnNameFirstWord(bookOne, "tom"));
    }

    public void testIsBookReadsYesTrue() {
        assertTrue(test.isBookReadsYes(book, "Tom", "Tim"));
    }

    public void testIsBookReadsYesFalse() {
        assertFalse(test.isBookReadsYes(book, "Tiem", "Tim"));
    }

    public void testIsBookReadsNoTrue() {
        assertTrue(test.isBookReadsNo(book, "Tom", "Tim"));
    }

    public void testIsBookReadsNoFalse() {
        assertFalse(test.isBookReadsNo(book, "Tiem", "Tim"));
    }

    public void testPrintAllBooksInLibrary() {
        assertEquals("Book Tom [Book Tim]", test.printAllBooksInLibrary(book));
    }

    public void testPrintIsBookReadsYes() {
        assertEquals("Book Tom [Book Tim]", test.printIsBookReadsYes(book, "Tom", "Tim"));
    }

    public void testPrintIsBookReadsNo() {
        assertEquals("Book Tom [Book Tim]", test.printIsBookReadsNo(book, "Tom", "Tim"));
    }
}