package com.javaguru.teacher.lesson_10.lessoncode.operations;

import java.util.Scanner;

class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberOperationType = scanner.nextLine();
        MathServiceFactory factory = new MathServiceFactory();
        MathService service = factory.create(numberOperationType);
        service.execute();
    }
}
