package com.javaguru.teacher.lesson_11.lessoncode.benchmarks;

import java.util.ArrayList;

class ArrayListAddToStart {

    /**
     * 300_000 - 8610
     *
     */

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 300_000; i++) {
            integers.add(0, i);
        }

        long finish = System.currentTimeMillis();
        long result = finish - start;

        System.out.println("Result: " + result + " ms");
    }
}
