package com.javaguru.student_vladimir_petranovski.lesson_9.level_7;

import com.javaguru.student_vladimir_petranovski.lesson_9.level_7.bean.ELibrary;
import com.javaguru.student_vladimir_petranovski.lesson_9.level_7.service.ELibraryService;

import java.util.ArrayList;

public class ELibraryDemo {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("Tom and Jerry");
        books.add("White Bim");
        books.add("Java in the beginning");
        books.add("Clean code");
        ELibrary eLibrary = new ELibrary(books);
        ELibraryService libraryService = new ELibraryService();
        libraryService.library(eLibrary, books);
    }
}
