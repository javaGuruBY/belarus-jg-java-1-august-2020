package com.javaguru.student_vladimir_petranovski.lesson_15.level_1;

class WordsService {
    public int countRepetitions(String[] words, String requireSearchWord) {
        int RepetitionsWord = 0;
        for (String word : words) {
            if (word.equals(requireSearchWord)) {
                RepetitionsWord++;
            }
        }
        return RepetitionsWord;
    }
}
