package com.javaguru.student_vadim_migun.lesson_7;
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

    String text;

    public String replacePunctuationMarks(String text) {
        text = text.replace(". ", " ");
        text = text.replace(", ", " ");
        System.out.println(text);
        return text;
    }

    public String lowerCaseAllWords(String text) {
        text = text.toLowerCase();
        System.out.println(text);
        return text;
    }

    public String textToArray() {

        String[] textArray = text.split(", ");  // текст в масссив
        System.out.println(Arrays.toString(textArray));
        return Arrays.toString(textArray);
    }

    // не понимаю как решить
/*
    int[] howManyTimesEachWordRepeated() {
        int[] wordCount = new int[textToArray().length()];
        for (int i = 0; i < textToArray().length(); i++) {


        }
    }
                
*/
            







    public static String findMostFrequentWord(String text) {


        String[] str = text.split(" ");
        int[] howMuch = new int[str.length];
        int maxCount = 0;
        int index = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (str[i].equals(str[j])) howMuch[i]++;
                for (int k = 0; k < howMuch.length; k++) {
                    if ((howMuch[i] > maxCount)) {
                        maxCount = howMuch[i];
                        index = i;
                    }

                }

            }

        }
        return str[index];
    }


    public static void main(String[] args) {

        String text = " I try to decide this task. The, task, is difficult for me. The task is interesting. Is is ";
        System.out.println(text);

        text = text.replace(". ", " "); // замена знаков препинания на пробел
        text = text.replace(", ", " "); // замена знаков препинания на пробел
        System.out.println(text);

        text = text.toLowerCase();  // // все к строчным буквам
        System.out.println(text);

        String[] textArray = text.split(", ");  // текст в масссив (удаление из массива ,)
        System.out.println(Arrays.toString(textArray));

        String word = findMostFrequentWord(text);
        System.out.println(word);

    }

}
