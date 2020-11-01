package com.javaguru.teacher.lesson_11.lessoncode.benchmarks;

import java.util.ArrayList;

class ArrayListAddToEnd {

    /**
     * 100_000_000 - 8185
     */

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000_000; i++) {
            integers.add(i);
        }

        long finish = System.currentTimeMillis();
        long result = finish - start;

        System.out.println("Result: " + result + " ms");
    }
}
