package com.javaguru.teacher.lesson_12.set;

import java.util.HashSet;
import java.util.Set;

class HashSetExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        boolean firstInsert = set.add("Ruslan");
        boolean secondInsert = set.add("Ruslan");
        System.out.println(set);

        System.out.println(firstInsert);
        System.out.println(secondInsert);
    }
}
