package com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service_search;

import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.bean.Book;

public class OrSearchCriteria implements SearchCriteria {
    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria (SearchCriteria leftCondition, SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }
    @Override
    public boolean match(Book book) {
        return leftCondition.match(book) || rightCondition.match(book);
    }
}
