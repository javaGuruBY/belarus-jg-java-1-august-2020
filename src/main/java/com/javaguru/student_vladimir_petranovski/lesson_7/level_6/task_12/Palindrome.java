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
        /*StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(text);*/
        //int length = text.length();
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
