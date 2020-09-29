package com.javaguru.student_vladimir_petranovski.lesson_7.level_1.task_1_task_2_task_3;

class WordServiceTest {
    private WordService wordService = new WordService();

    public void findMostFrequentWordTestOne() {
        String text = "You not know that you do";
        String expected = "you";
        String actual = wordService.findMostFrequentWord(text);
        checkResult(expected.equals(actual), "findMostFrequentWordTestOne");
    }

    public void findMostFrequentWordTestTwo() {
        String text = "Tania take a shower. Vasia take a shower.";
        String expected = "take";
        String actual = wordService.findMostFrequentWord(text);
        checkResult(expected.equals(actual), "findMostFrequentWordTestTwo");
    }

    public void findMostFrequentWordTestThree() {
        String text = "He do it and she make) it.";
        String expected = "it";
        String actual = wordService.findMostFrequentWord(text);
        checkResult(expected.equals(actual), "findMostFrequentWordTestThree");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = SUCCESS");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.findMostFrequentWordTestOne();
        test.findMostFrequentWordTestTwo();
        test.findMostFrequentWordTestThree();
    }
}
