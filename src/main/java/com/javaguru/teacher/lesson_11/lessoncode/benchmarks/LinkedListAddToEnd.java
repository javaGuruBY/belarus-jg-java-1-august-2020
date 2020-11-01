package com.javaguru.teacher.lesson_11.lessoncode.benchmarks;

import java.util.LinkedList;

class LinkedListAddToEnd {

    /**
     * 10_000_000 - 2156
     * 10_000_000 - 2129
     *
     */
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            integers.add(i);
        }

        long finish = System.currentTimeMillis();
        long result = finish - start;

        System.out.println("Result: " + result + " ms");
    }
}
