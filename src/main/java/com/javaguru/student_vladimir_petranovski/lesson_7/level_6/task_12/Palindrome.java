package com.javaguru.student_vladimir_petranovski.lesson_7.level_6.task_12;
/*
Написать программу, которая определяет, является ли строка палиндромом.
Палиндром - это буквосочетание, слово или текст, одинаково читающееся в обоих направлениях.
Иногда палиндромом называют любой симметричный относительно своей середины набор символов,
например: "racecar", "level", "sum summus mus", "А роза упала на лапу Азора".

Создать класс Palindrome, который реализует следующий метод:

boolean isPalindrome(String text) - метод возвращает true, если строка является палиндромом, в противном случае false;

Ограничения:
- Логику проверки необходимо реализовать при помощи массивов;
- Знаки препинания и регистр при проверке необходимо игнорировать (Le,VEl = level);

Написать тестовые сценарии для класса Palindrome в классе PalindromeTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */

class Palindrome {
    boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }
        String str = convertArrayToString(divideStringByArrayWordsWithoutPunctuationMarksAndBlanks(text), text);

        /*StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(str);*/
        //int length = str.length();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    String[] divideStringByArrayWordsWithoutPunctuationMarksAndBlanks(String text) {
        String[] words = text.toLowerCase().split("[\\p{Punct}\\s]+");
        return words;
    }

    String convertArrayToString(String[] array, String text) {
        String str = new String();
        for (String s : divideStringByArrayWordsWithoutPunctuationMarksAndBlanks(text)) {
            str += s;
        }
        return str;
    }
}
