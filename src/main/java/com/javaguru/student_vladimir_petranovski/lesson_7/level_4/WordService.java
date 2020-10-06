package com.javaguru.student_vladimir_petranovski.lesson_7.level_4;

class WordService {
    /*String findMostFrequentWord(String text) {

        return divideStringByArrayWord(text)[foundMaxAmountRepeatWordOnIndex(text)];
    }

    static String[] divideStringByArrayWord(String text) {
        String[] words = text.toLowerCase().split("[\\p{Punct}\\s]+");
        return words;
    }

    static int[] fillArrayIntegerForCountEachWord(String text) {
        int[] count = new int[divideStringByArrayWord(text).length];
        for (int i = 0; i < divideStringByArrayWord(text).length; i++) {
            for (String s : divideStringByArrayWord(text)) {
                if (divideStringByArrayWord(text)[i].equals(s)) {
                    count[i]++;
                }
            }
        }
        return count;
    }

    static int foundMaxAmountRepeatWordOnIndex(String text) {
        int max = 0, index = 0;
        for (int i = 0; i < fillArrayIntegerForCountEachWord(text).length; i++) {
            if (max < fillArrayIntegerForCountEachWord(text)[i]) {
                max = fillArrayIntegerForCountEachWord(text)[i];
                index = i;
            }
        }
        return index;
    }*/
    String findMostFrequentWord(String text) {

        return divideStringByArrayWord(text)[foundMaxAmountRepeatWordOnIndex(text)];
    }

    static String[] divideStringByArrayWord(String text) {
        String[] words = text.toLowerCase().split("[\\p{Punct}\\s]+");
        return words;
    }

    static int[] fillArrayIntegerForCountEachWord(String text) {
        int[] count = new int[divideStringByArrayWord(text).length];
        return findValueCountEachElementArray(text, count);
    }

    static int[] findValueCountEachElementArray(String text, int[] count) {
        for (int i = 0; i < divideStringByArrayWord(text).length; i++) {
            for (String s : divideStringByArrayWord(text)) {
                if (divideStringByArrayWord(text)[i].equals(s)) {
                    count[i]++;
                }
            }
        }
        return count;
    }

    static int foundMaxAmountRepeatWordOnIndex(String text) {
        int max = 0, index = 0;
        return findIndexOnMaxValue(text, max, index);
    }

    static int findIndexOnMaxValue(String text, int max, int index) {
        for (int i = 0; i < fillArrayIntegerForCountEachWord(text).length; i++) {
            if (max < fillArrayIntegerForCountEachWord(text)[i]) {
                max = fillArrayIntegerForCountEachWord(text)[i];
                index = i;
            }
        }
        return index;
    }
}

