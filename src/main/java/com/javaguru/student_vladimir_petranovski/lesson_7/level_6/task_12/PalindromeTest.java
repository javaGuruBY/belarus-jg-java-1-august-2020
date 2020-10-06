package com.javaguru.student_vladimir_petranovski.lesson_7.level_6.task_12;


class PalindromeTest {
    private Palindrome palindrome = new Palindrome();

    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.isPalindromeTrue();
        test.isPalindromeFalse();

        test.isPalindromeOne();
        test.isPalindromeTwo();
        test.isPalindromeThree();
        test.isPalindromeFour();
    }

    void isPalindromeTrue() {
        String text = "racecar";
        boolean expected = true;
        boolean actual = palindrome.isPalindrome(convertArrayToString(divideStringByArrayWordsWithoutPunctuationMarksAndBlanks(text), text));
        checkResult(expected == actual, "isPalindromeTrue");
    }

    void isPalindromeFalse() {
        String text = "racecared";
        boolean expected = false;
        boolean actual = palindrome.isPalindrome(convertArrayToString(divideStringByArrayWordsWithoutPunctuationMarksAndBlanks(text), text));
        checkResult(expected == actual, "isPalindromeFalse");
    }

    void isPalindromeOne() {
        String text = "level";
        boolean expected = true;
        boolean actual = palindrome.isPalindrome(convertArrayToString(divideStringByArrayWordsWithoutPunctuationMarksAndBlanks(text), text));
        checkResult(expected == actual, "isPalindromeOne");
    }

    void isPalindromeTwo() {
        String text = "sum summus mus";
        boolean expected = true;
        boolean actual = palindrome.isPalindrome(convertArrayToString(divideStringByArrayWordsWithoutPunctuationMarksAndBlanks(text), text));
        checkResult(expected == actual, "isPalindromeTwo");
    }

    void isPalindromeThree() {
        String text = "А роза упала на лапу Азора";
        boolean expected = true;
        boolean actual = palindrome.isPalindrome(convertArrayToString(divideStringByArrayWordsWithoutPunctuationMarksAndBlanks(text), text));
        checkResult(expected == actual, "isPalindromeThree");
    }

    void isPalindromeFour() {
        String text = "A h!H, a";
        boolean expected = true;
        boolean actual = palindrome.isPalindrome(convertArrayToString(divideStringByArrayWordsWithoutPunctuationMarksAndBlanks(text), text));
        checkResult(expected == actual, "isPalindromeFour");
    }

    String[] divideStringByArrayWordsWithoutPunctuationMarksAndBlanks(String text) {
        String[] words = text.toLowerCase().split("[\\p{Punct}\\s]+");
        return words;
    }

    String convertArrayToString(String[] array, String text) {
        String str = new String();
        for (String s : divideStringByArrayWordsWithoutPunctuationMarksAndBlanks(text)) {
            str += s;
        }
        return str;
    }

    void checkResult(boolean condition, String testName) {
        if(condition) {
            System.out.println(testName + " = SUCCESS");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }
}
