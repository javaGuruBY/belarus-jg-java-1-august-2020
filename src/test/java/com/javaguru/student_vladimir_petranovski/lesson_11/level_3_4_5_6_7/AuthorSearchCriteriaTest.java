package com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7;

import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.bean.Book;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service_search.AuthorSearchCriteria;
import junit.framework.TestCase;

public class AuthorSearchCriteriaTest extends TestCase {
    private final AuthorSearchCriteria test = new AuthorSearchCriteria("authorFour");

    private final Book book1 = new Book("White Bim", "Anderson");
    private final Book book4 = new Book("Four", "authorFour");

    public void testMatchTrue() {
        assertTrue(test.match(book4));
    }

    public void testMatchFalse() {
        assertFalse(test.match(book1));
    }
}