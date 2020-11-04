package com.javaguru.student_vladimir_petranovski.lesson_11.level_2.task_6;

import junit.framework.TestCase;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImplTest extends TestCase {
    private final BookDatabaseImpl test = new BookDatabaseImpl();
    private final List<Book> list = new ArrayList<>();
    private final Book book1 = new Book("White Bim", "Anderson");
    private final Book book2 = new Book("An black ear", "Pushkin");
    private final Book book3 = new Book("Tom and Jerry", "Tim Silvia");
    private final Book book4 = new Book("Four", "authorFour");
    private final Book book5 = new Book("Five", "authorFive");
    private final Book book6 = new Book("Six", "authorSix");

    @Before
    public void setUp() {
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);

        test.save(book1);
        test.save(book2);
        test.save(book3);
        test.save(book4);
        test.save(book5);
    }

    public void testSave() {
        Long expected = 1L;
        assertEquals(expected, test.save(book1));
    }

    public void testDeleteIdTrue() {
        assertTrue(test.delete(1L));
    }

    public void testDeleteIdFalse() {
        assertFalse(test.delete(5L));
    }

    public void testIsExistBookTrue() {
        assertTrue(test.isExistBook(1L));
    }

    public void testIsExistBookFalse() {
        assertFalse(test.isExistBook(2L));
    }

    public void testDeleteBookTrue() {
        assertTrue(test.delete(book2));
    }

    public void testDeleteBookFalse() {
        assertFalse(test.delete(book6));
    }

    public void testFindBookTrue() {
        assertTrue(test.findBook(book1));
    }

    public void testFindBookFalse() {
        assertFalse(test.findBook(book6));
    }

    public void testFindByIdBook() {
        assertEquals(Optional.of(book1), test.findById(1L));
    }

    public void testFindByIdEmpty() {
        assertEquals(Optional.empty(), test.findById(2L));
    }

    public void testFindByAuthor() {
        List<Book> expected = new ArrayList<>();
        expected.add(book2);
        assertEquals(expected, test.findByAuthor("Pushkin"));
    }

    public void testFindByTitle() {
        List<Book> expected = new ArrayList<>();
        expected.add(book3);
        assertEquals(expected, test.findByTitle("tom and jerry"));
    }

    public void testCountAllBooks() {
        assertEquals(5, test.countAllBooks());
    }

    public void testDeleteByAuthor() {
        List<Book> expected = Arrays.asList(book1, book2, book4, book5);
        list.removeAll(test.findByAuthor("Tim Silvia"));
        assertEquals(expected, list);
    }


    public void testDeleteByTitle() {
        List<Book> expected = Arrays.asList(book1, book2, book3, book4);
        list.removeAll(test.findByTitle("Five"));
        assertEquals(expected, list);
    }
}