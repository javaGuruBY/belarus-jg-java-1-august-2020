package com.javaguru.student_vladimir_petranovski.lesson_6.level_4.task_16;
/*
Как выйти из бесконечного цикла?
Найдите в интернете и напишите пример кода
для циклов while и for.
 */

class EndlessLoopsStop {
    public static void endlessLoops() {
        while (true) {
            System.out.println("Hi");
            break;
        }
    }

    public static void endlessLoops1() {
        for (; ; ) {
            System.out.println("Hi");
            break;
        }
    }
}
