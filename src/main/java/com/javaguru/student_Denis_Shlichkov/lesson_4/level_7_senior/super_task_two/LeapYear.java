package com.javaguru.student_Denis_Shlichkov.lesson_4.level_7_senior.super_task_two;

class LeapYear {
    // return true - если год високосный
    // return false - если год обычный
    boolean isLeapYear(int year) {
        if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0)  {
            return true;
        }
        else {
            return false;
        }
        // Если год не делится на 4, значит он обычный.
        // Иначе надо проверить не делится ли год на 100.
        // Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
        // Если делится на 100, значит это столетие и его следует проверить его делимость на 400.
        // Если год делится на 400, то он високосный.
        // Иначе год обычный.
    }
}
