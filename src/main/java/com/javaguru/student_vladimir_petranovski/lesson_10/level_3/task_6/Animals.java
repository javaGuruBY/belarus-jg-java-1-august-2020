package com.javaguru.student_vladimir_petranovski.lesson_10.level_3.task_6;

@java.lang.FunctionalInterface
public interface Animals {
    void voice();

    default void print() {
        System.out.println("Anything");
    }

    boolean equals(Object o);
}
