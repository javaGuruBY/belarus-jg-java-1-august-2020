package com.javaguru.student_vladimir_petranovski.lesson_7.level_1.task_1_task_2_task_3;
/*
Дана строка с текстом.
Написать метод, который найдёт слово, которое в тексте встречается больше всего раз.

class WordService {

    public String findMostFrequentWord(String text) {
           // write solution here
    }

}

Если несколько слов в тексте встречаются одинаково максимальное число раз,
то возвращаем то слово, которое стоит в тексте первым.

Подумайте на какие подзадачи можно разбить эту задачу?
Распишите на бумаге каждую подзадачу в отдельности:
- как она называется,
- что её надо передать на вход (параметры),
- что будет возвращать в качестве результата.

PS: если вы не можете придумать как разбить эту задачу на подзадачи,
пожалуйста попросите помощи! Умение попросить помощи, когда это нужно
навес золота в ИТ.

Убедитесь, что вы сможете из решений всех подзадач
собрать решение главной задачи.
 */

import java.util.Arrays;

class WordService {
    String findMostFrequentWord(String text) {

        return divideStringByArrayWord(text)[foundMaxAmountRepeatWordOnIndex(text)];
    }

    static String[] divideStringByArrayWord(String text) {
        String[] words = text.toLowerCase().split("[\\p{Punct}\\s]+");
        return words;
    }

    static int[] fillArrayIntegerForCountEachWord(String text) {
        int[] count = new int[divideStringByArrayWord(text).length];
        for (int i = 0; i < divideStringByArrayWord(text).length; i++) {
            for (String s : divideStringByArrayWord(text)) {
                if (divideStringByArrayWord(text)[i].equals(s)) {
                    count[i]++;
                }
            }
        }
        return count;
    }

    static int foundMaxAmountRepeatWordOnIndex(String text) {
        int max = 0, index = 0;
        for (int i = 0; i < fillArrayIntegerForCountEachWord(text).length; i++) {
            if (max < fillArrayIntegerForCountEachWord(text)[i]) {
                max = fillArrayIntegerForCountEachWord(text)[i];
                index = i;
            }
        }
        return index;
    }
}