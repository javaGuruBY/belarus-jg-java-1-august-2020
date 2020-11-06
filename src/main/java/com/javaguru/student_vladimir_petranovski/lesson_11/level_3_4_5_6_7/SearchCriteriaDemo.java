package com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7;

import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.bean.Book;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service_search.*;

public class SearchCriteriaDemo {
    public static void main(String[] args) {
        Book book = new Book("Zveroboi", "Kuper", "1890");

        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria yearOfIssue = new YearOfIssueSearchCriteria("1890");

        SearchCriteria searchCriteria1 = new AndSearchCriteria(titleSearchCriteria, authorSearchCriteria);
        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearOfIssue);
        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria, yearOfIssue);
        SearchCriteria searchCriteria4 = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        System.out.println(searchCriteria1.match(book));
        System.out.println(searchCriteria2.match(book));
        System.out.println(searchCriteria3.match(book));
        System.out.println(searchCriteria4.match(book));
    }
}
