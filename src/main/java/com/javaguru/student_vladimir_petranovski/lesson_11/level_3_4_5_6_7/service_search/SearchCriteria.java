package com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service_search;

import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.bean.Book;

public interface SearchCriteria {

    boolean match(Book book);
}
