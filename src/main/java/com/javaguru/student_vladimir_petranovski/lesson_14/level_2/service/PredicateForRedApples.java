package com.javaguru.student_vladimir_petranovski.lesson_14.level_2.service;

import com.javaguru.student_vladimir_petranovski.lesson_14.level_2.bean.Apple;

public class PredicateForRedApples implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("red");
    }
}
