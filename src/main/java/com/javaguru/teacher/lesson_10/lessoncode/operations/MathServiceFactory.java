package com.javaguru.teacher.lesson_10.lessoncode.operations;

class MathServiceFactory {

    MathService create(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        if (type.equals("double")) {
            return new DoubleNumberMathService();
        }
        if (type.equals("int")) {
            return new IntegerNumberMathService();
        }
        return null;
    }
}
