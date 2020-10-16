package com.javaguru.student_vladimir_petranovski.lesson_9.level_7.service;

import com.javaguru.student_vladimir_petranovski.lesson_9.level_7.bean.ELibrary;

import java.util.ArrayList;
import java.util.Scanner;

public class ELibraryService {

    String searchBookInLibrary(ArrayList<String> books, String name) {
        return books.contains(name) ? "Вы нашли книгу " + name + "." : "Library doesn't have this book.";
    }

    ArrayList<String> getBookFromLibrary(ArrayList<String> books, String name) {
        books.remove(name);
        return books;
    }

    ArrayList<String> returnBookInLibrary(ArrayList<String> books, String name) {
        books.set(0, name);
        return books;
    }

    boolean isBookInLibrary(ArrayList<String> books, String name) {
        return books.contains(name);
    }

    boolean isBookReserved(ArrayList<String> books, String name) {
        return isBookInLibrary(books, name);
    }

    ArrayList<String> reservedBook(ArrayList<String> books, String name) {
        books.remove(name);
        return books;
    }

    String deliveryDate(ELibrary eLibrary) {
        return "Deadline this book " + eLibrary.getDeadlineInDay() + " days.";
    }

    double fine(ELibrary eLibrary) {
        double fineMethod = 0;
        if (3 * eLibrary.getDeadlineInDay() < eLibrary.getDayOfDelay()) {
            fineMethod = 3 * eLibrary.getFine();
        } else if  (2 * eLibrary.getDeadlineInDay() < eLibrary.getDayOfDelay()){
            fineMethod = 2 * eLibrary.getFine();
        } else if (eLibrary.getDeadlineInDay() < eLibrary.getDayOfDelay()) {
            fineMethod = eLibrary.getFine();
        }
        return fineMethod;
    }

    ArrayList<String> addBookInLibrary(ArrayList<String> books, String name) {
        books.add(0, name);
        return books;
    }

    public void library(ELibrary eLibrary, ArrayList<String> books) {
        System.out.println("Добро пожаловать в нашу библиотеку!");
        System.out.println("Введите пожалуйста 1, если вы хотите взять книгу из библиотеки");
        System.out.println("Введите пожалуйста 2, если вы хотите вернуть книгу в библиотеку");
        System.out.println("Введите пожалуйста 3, если вы хотите найти книгу в библиотеке");
        System.out.println("Введите пожалуйста 4, если вы хотите зарезервировать книгу в библиотеке");
        System.out.println("Введите пожалуйста 5, если вы хотите подарить книгу в библиотеке");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        switch (n) {
            case 1:
                System.out.println("Введите пожалуйста название книги:");
                eLibrary.setBookName(scanner.nextLine());
                String name = scanner.nextLine();
                if(isBookInLibrary(books, name)) {
                    getBookFromLibrary(books, name);
                    System.out.println("Пожалуйста, возьмите вашу книгу " + name + "!");
                    System.out.println(deliveryDate(eLibrary));
                    System.out.println("Если вы не сдатите книгу во время, нам придется наложить на вас штрафные санкции в виде штрафа!");
                    eLibrary.setDayOfDelay(9);
                    System.out.println("Если " + eLibrary.getDayOfDelay() + " дней, то штраф " + fine(eLibrary));
                } else {
                    System.out.println("Такой книги нет в библиотеке или она зарезервирована.");
                }
                break;
            case 2:
                System.out.println("Введите пожалуйста название книги:");
                eLibrary.setBookName(scanner.nextLine());
                name = scanner.nextLine();
                returnBookInLibrary(books, name);
                System.out.println("Спасибо, что сдали во время, приходите еще!");
                break;
            case 3:
                System.out.println("Введите пожалуйста название книги:");
                eLibrary.setBookName(scanner.nextLine());
                name = scanner.nextLine();
                System.out.println(searchBookInLibrary(books, name));
                break;
            case 4:
                System.out.println("Введите пожалуйста название книги:");
                eLibrary.setBookName(scanner.nextLine());
                name = scanner.nextLine();
                if (isBookInLibrary(books, name)) {
                    reservedBook(books, name);
                    System.out.println("Вы успешно зарезервировали книгу" + name);
                } else {
                    System.out.println("Такой книги нет, может другую?");
                }
                break;
            case 5:
                System.out.println("Введите пожалуйста название книги:");
                eLibrary.setBookName(scanner.nextLine());
                name = scanner.nextLine();
                addBookInLibrary(books, name);
                System.out.println("Спасибо большое за книгу! Мы вам очень признательны.");
                break;
            default:
                System.out.println("Такой услуги мы не оказываем. Спасибо, что вы посетили нашу библиотеку!");
        }

    }
}
