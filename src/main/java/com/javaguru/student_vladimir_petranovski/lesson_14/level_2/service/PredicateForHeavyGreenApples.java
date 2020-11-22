package com.javaguru.student_vladimir_petranovski.lesson_14.level_2.service;

import com.javaguru.student_vladimir_petranovski.lesson_14.level_1.bean.AppleWeightConstance;
import com.javaguru.student_vladimir_petranovski.lesson_14.level_2.bean.Apple;

public class PredicateForHeavyGreenApples implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green")
                && apple.getWeight() > AppleWeightConstance.SET_WEIGHT;
    }
}
