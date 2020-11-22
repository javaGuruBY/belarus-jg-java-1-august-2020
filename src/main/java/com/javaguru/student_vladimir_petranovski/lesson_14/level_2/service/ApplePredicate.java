package com.javaguru.student_vladimir_petranovski.lesson_14.level_2.service;

import com.javaguru.student_vladimir_petranovski.lesson_14.level_2.bean.Apple;

@FunctionalInterface
public interface ApplePredicate {
    boolean test(Apple apple);
}
