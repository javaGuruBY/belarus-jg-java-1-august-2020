package com.javaguru.student_vadim_migun.training.lesson_10;

import java.util.Scanner;

class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberOperationType = scanner.nextLine();
        MathService service = getByType(numberOperationType);
        service.execute();

    }
    static MathService getByType(String operationType) {
        if (operationType.equals("double")) {
            return new DoubleNumberMathService();
        }
        if (operationType.equals("int")) {
            return new IntegerNumberMathService();
        }
        return null;
    }


}
