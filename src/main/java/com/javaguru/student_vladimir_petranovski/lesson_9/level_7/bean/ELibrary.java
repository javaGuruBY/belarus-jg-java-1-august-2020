package com.javaguru.student_vladimir_petranovski.lesson_9.level_7.bean;
/*
Разработать доменную модель для электронной системы управления библиотекой.
Доменная модель должна в будущем давать возможность поддерживать следующие операции:
- взять книгу из библиотеки;
- вернуть книгу в библиотеку;
- поиск нужной книги;
- резервация книги;
- рассылка оповещений читателям о сроке сдачи книги в библиотеку;
- выписывание штрафов за вовремя не сданные книги;
- добавление новой книги в библиотеку.

В рамках данной задачи нужно только попробовать разработать модель
данных (pojo классы), которые будут описывать данные, которые нужны для
реализации указанных выше операций. Можно создать модель, которая будет
поддерживать только часть указанных выше операций.
 */

import java.util.ArrayList;
import java.util.Objects;

public class ELibrary {
    private String bookName;
    private ArrayList<String> books;
    private final int deadlineInDay = 7;
    private int dayOfDelay;
    private final double fine = 100;

    public ELibrary(ArrayList<String> books) {
        this.books = books;
    }

    public int getDeadlineInDay() {
        return deadlineInDay;
    }

    public double getFine() {
        return fine;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getDayOfDelay() {
        return dayOfDelay;
    }

    public void setDayOfDelay(int day) {
        this.dayOfDelay = day;
    }

    @Override
    public String toString() {
        return "ELibrary{" +
                "bookName='" + bookName + '\'' +
                ", books=" + books +
                ", deadlineInDay=" + deadlineInDay +
                ", dayOfDelay=" + dayOfDelay +
                ", fine=" + fine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ELibrary eLibrary = (ELibrary) o;
        return deadlineInDay == eLibrary.deadlineInDay &&
                dayOfDelay == eLibrary.dayOfDelay &&
                Double.compare(eLibrary.fine, fine) == 0 &&
                Objects.equals(bookName, eLibrary.bookName) &&
                Objects.equals(books, eLibrary.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, books, deadlineInDay, dayOfDelay, fine);
    }
}
