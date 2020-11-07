package com.javaguru.teacher.lesson_12.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class ListStreamExample {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("AAAA");
        strings.add("BBB");
        strings.add("CC");
        strings.add("D");

        List<String> secondList = new ArrayList<>();
        for (String str : strings) {
            if (str.length() <= 2) {
                secondList.add(str);
            }
        }
        System.out.println(secondList);

        strings
                .stream()
                .filter(str -> str.length() <= 2)
                .map(str -> str.toLowerCase() + str.length())
                .forEach(str -> System.out.println(str));
    }
}
