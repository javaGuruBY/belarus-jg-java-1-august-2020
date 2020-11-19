package com.javaguru.student_vladimir_petranovski.lesson_13.level_6.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckForForbiddenCharsUtil {
    private CheckForForbiddenCharsUtil() {
    }

    public static boolean check(String text) {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }
}
