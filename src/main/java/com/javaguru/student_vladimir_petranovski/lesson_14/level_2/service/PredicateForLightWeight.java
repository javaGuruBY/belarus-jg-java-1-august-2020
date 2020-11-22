package com.javaguru.student_vladimir_petranovski.lesson_14.level_2.service;

import com.javaguru.student_vladimir_petranovski.lesson_14.level_2.bean.Apple;
import com.javaguru.student_vladimir_petranovski.lesson_14.level_1.bean.AppleWeightConstance;

public class PredicateForLightWeight implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() <= AppleWeightConstance.SET_WEIGHT;
    }
}
