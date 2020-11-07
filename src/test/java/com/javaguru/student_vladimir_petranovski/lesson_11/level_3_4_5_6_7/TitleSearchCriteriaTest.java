package com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7;

import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.bean.Book;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service.service_search.TitleSearchCriteria;
import junit.framework.TestCase;

public class TitleSearchCriteriaTest extends TestCase {
    private final TitleSearchCriteria test = new TitleSearchCriteria("Six");

    private final Book book4 = new Book("Four", "authorFour");
    private final Book book6 = new Book("Six", "authorSix");

    public void testMatchTrue() {
        assertTrue(test.match(book6));
    }

    public void testMatchFalse() {
        assertFalse(test.match(book4));
    }
}