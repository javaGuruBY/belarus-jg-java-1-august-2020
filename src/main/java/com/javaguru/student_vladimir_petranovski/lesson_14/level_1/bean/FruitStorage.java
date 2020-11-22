package com.javaguru.student_vladimir_petranovski.lesson_14.level_1.bean;

import java.util.ArrayList;
import java.util.List;

public class FruitStorage {
    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    public List<Apple> findAllGreenApples() {
        List<Apple> greenApples = new ArrayList<>();
        for (Apple apples : getAllApples()) {
            if ("green".equals(apples.getColor())) {
                greenApples.add(apples);
            }
        }
        return greenApples;
    }

    public List<Apple> findAllApplesByColor(String color) {
        List<Apple> allApplesByColor = new ArrayList<>();
        for (Apple apple : getAllApples()) {
            if (color.equals(apple.getColor())) {
                allApplesByColor.add(apple);
            }
        }
        return allApplesByColor;
    }

    public List<Apple> findAllApplesByWeight() {
        List<Apple> allApplesWithWeightMoreSet = new ArrayList<>();
        for (Apple apple : getAllApples()) {
            if (apple.getWeight() > AppleWeightConstance.SET_WEIGHT) {
                allApplesWithWeightMoreSet.add(apple);
            }
        }
        return allApplesWithWeightMoreSet;
    }
}
