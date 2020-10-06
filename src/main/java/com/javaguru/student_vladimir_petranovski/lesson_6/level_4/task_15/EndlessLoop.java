package com.javaguru.student_vladimir_petranovski.lesson_6.level_4.task_15;
/*
Напишите бесконечный цикл при помощи while и for.
 */

class EndlessLoop {
    public static void endlessLoops() {
        while (true) {
            System.out.println("Hi");
        }
    }

    public void endlessLoops1() {
        for (; ; ) {
            System.out.println("Hi");
        }
    }
}
