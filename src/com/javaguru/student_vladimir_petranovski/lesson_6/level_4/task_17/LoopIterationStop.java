package com.javaguru.student_vladimir_petranovski.lesson_6.level_4.task_17;
/*
Как досрочно закончить текущую итерацию цикла?
Найдите ответ в интернете и напишите пример кода
для циклов while и for.
 */

class LoopIterationStop {
    public static void endlessLoops() {
        int a = 1;
        while (a > 0) {
            if (a == 3) {
                break;
            }
            System.out.println("Hi");
            a++;
        }
    }

    public static void endlessLoops1() {
        for (int i = 0; i >= 0; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("Hi");
        }
    }

    public static void main(String[] args) {
        endlessLoops();
        endlessLoops1();
    }
}
