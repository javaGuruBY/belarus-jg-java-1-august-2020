package com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7;

import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.bean.Book;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service_search.AndSearchCriteria;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service_search.AuthorSearchCriteria;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service_search.SearchCriteria;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service_search.TitleSearchCriteria;
import junit.framework.TestCase;

public class AndSearchCriteriaTest extends TestCase {
    private final SearchCriteria titleToSearch = new TitleSearchCriteria("One");
    private final SearchCriteria authorToSearch = new AuthorSearchCriteria("AuthorOne");
    private final Book book1 = new Book("One", "AuthorOne");
    private final Book book2 = new Book("Two", "AuthorOne");
    private final AndSearchCriteria test = new AndSearchCriteria(titleToSearch, authorToSearch);

    public void testMatchTrue() {
        assertTrue(test.match(book1));
    }

    public void testMatchFalse() {
        assertFalse(test.match(book2));
    }
}