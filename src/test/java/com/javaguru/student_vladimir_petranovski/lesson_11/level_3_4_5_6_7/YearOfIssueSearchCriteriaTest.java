package com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7;

import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.bean.Book;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service.service_search.YearOfIssueSearchCriteria;
import junit.framework.TestCase;

public class YearOfIssueSearchCriteriaTest extends TestCase {

    private final YearOfIssueSearchCriteria test = new YearOfIssueSearchCriteria("2000");

    private final Book book2 = new Book("An black ear", "Pushkin", "1799");
    private final Book book5 = new Book("Five", "authorFive", "2000");

    public void testMatchTrue() {
        assertTrue(test.match(book5));
    }

    public void testMatchFalse() {
        assertFalse(test.match(book2));
    }
}