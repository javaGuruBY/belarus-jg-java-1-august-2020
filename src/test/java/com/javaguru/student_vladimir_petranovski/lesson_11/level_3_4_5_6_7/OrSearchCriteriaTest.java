package com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7;

import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.bean.Book;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service_search.AuthorSearchCriteria;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service_search.OrSearchCriteria;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service_search.SearchCriteria;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service_search.TitleSearchCriteria;
import junit.framework.TestCase;

public class OrSearchCriteriaTest extends TestCase {

    private final SearchCriteria titleToSearch = new TitleSearchCriteria("Three");
    private final SearchCriteria authorToSearch = new AuthorSearchCriteria("AuthorThree");
    private final Book book1 = new Book("One","AuthorThree");
    private final Book book2 = new Book("One","AuthorTwo");
    private final OrSearchCriteria test = new OrSearchCriteria(titleToSearch, authorToSearch);


    public void testMatchTrue() {
        assertTrue(test.match(book1));
    }

    public void testMatchFalse() {
        assertFalse(test.match(book2));
    }
}