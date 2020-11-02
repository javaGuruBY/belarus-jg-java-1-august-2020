package com.javaguru.student_vladimir_petranovski.lesson_11.level_1.task_1;
/*
Какие реализации интерфейса java.util.List вы знаете?
Напишите программу, которая демонстрирует создание разных списков.
PS: чем они отличаются друг от друга?
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ImplementsList {
    // Существует две реализации List: ArrayList and LinkedList
    // ArrayList это список, реализованный на основе массива,
    // а LinkedList — это классический связный список, основанный на объектах с ссылками между ними.
    List<Integer> number = new ArrayList<>();
    List<Integer> numberOne = new LinkedList<>();

    // Каждый по соему хорош, и тот или иной используется в зависимости от задачи.
    // Во сновном используют ArrayList, но если нужно часто пользоваться вставкой элемента в лист
    // в начало либо в середину, тогда используют LinkedList
    // это значительно уменьшает время
}
