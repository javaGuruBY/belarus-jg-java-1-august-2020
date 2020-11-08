package com.javaguru.student_vladimir_petranovski.lesson_12.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class ListStream {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("AAAA");
        list.add("BBB");
        list.add("DD");
        list.add("C");

        for (String s : list) {
            System.out.println(s);
        }

        List<String> secondList = new ArrayList<>();
        for (String s: list) {
            if (s.length() <= 2) {
                secondList.add(s);
            }
        }
        System.out.println(secondList);

//        List<String> thirdList = list.stream()
//                .filter(s -> s.length() <= 2)
//                .map(s -> s.toLowerCase())
//                .collect(Collectors.toList());
//        System.out.println(thirdList);
        list.stream()
                .filter(s -> s.length() <= 2)
                .map(s -> s.toLowerCase() + s.length())
                //.forEach(System.out::println);
                .forEach(s -> System.out.println(s));
    }

}
