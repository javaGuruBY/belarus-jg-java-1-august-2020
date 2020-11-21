package com.javaguru.student_vladimir_petranovski.lesson_13.level_6.util;

public class TransformationTextInExpression {

    private TransformationTextInExpression() {

    }

    public static String findExpression(String text) {
        String[] str = text.split(" ");
        String str1 = "";
        for (String s : str) {
            str1 += s;
        }
        return str1;
    }

}
