package com.javaguru.student_vladimir_petranovski.lesson_14.level_2.bean;

import com.javaguru.student_vladimir_petranovski.lesson_14.level_2.service.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

public class FruitStorage {

    public List<Apple> findApples(List<Apple> saved, ApplePredicate applePredicate) {
        List<Apple> listApples = new ArrayList<>();
        for (Apple apple : saved) {
            if (applePredicate.test(apple)) {
                listApples.add(apple);
            }
        }

        return listApples;
    }
}
