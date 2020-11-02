package com.javaguru.student_vladimir_petranovski.lesson_11.level_1.task_4;
/*
Могут ли реализации интерфейса java.util.List хранить одинаковые
элементы (дубликаты)? Напишите код программы, который демонстрирует
ответ на этот вопрос.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Duplicates { // да могут

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Vova");
        name.add("Roma");
        name.add("Vova");
        for (String s : name) {
            System.out.println(s);
        }
        List<String> nameL = new LinkedList<>();
        nameL.add("Petr");
        nameL.add("Sania");
        nameL.add("Petr");
        for (String s : nameL) {
            System.out.println(s);
        }

    }

}
