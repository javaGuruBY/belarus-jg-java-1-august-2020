package lesson_6.level_3_junior.task_13;

import java.util.Arrays;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
        test.findNumberArray();
        test.findNumberOfNumbersTest();
        test.replaceTest();
        test.replaceAllTest();
        test.arrayReverseTest();
    }

    void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayReference = new int[9];
        int[] arrayCreated = arrayUtil.createArray(9);
        System.out.println("If the arrays are the same");
        if (arrayReference.length == arrayCreated.length) {
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
        int[] arrayReferenceSecond = new int[10];
        int[] arrayCreatedSecond = arrayUtil.createArray(9);
        //проверка на количество элементов
        System.out.println("If the arrays are different");
        if (arrayReferenceSecond.length != arrayCreatedSecond.length) {
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

    void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayNumbers = 9;
        int[] arrayReference = arrayUtil.createArray(arrayNumbers);
        int[] arrayCreated = new int[arrayNumbers];
        //заполнение эталонного массива случайными элементами
        for (int i = 0; i < arrayNumbers; i++) {
            arrayReference[i] = (int) (Math.random() * 101);
        }
        arrayUtil.fillArrayWithRandomNumbers(arrayCreated);
        System.out.println("Test arrays to fill with random numbers");
        if (Arrays.equals(arrayCreated, arrayReference)) {
            System.out.println("Test - FAIL");
        } else System.out.println("Test - OK");
    }

    void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayNumbers = 9;
        int[] arrayCreated = new int[arrayNumbers];
        arrayUtil.fillArrayWithRandomNumbers(arrayCreated);
        int maxNumberTest = arrayCreated[0];
        for (int i = 1; i < arrayCreated.length; i++) {
            if (maxNumberTest > arrayCreated[i]) {
                maxNumberTest = arrayCreated[i];
            }
        }
        int maxNumber = arrayUtil.findMaxNumber(arrayCreated);
        System.out.println("Maximum number test");
        if (maxNumber == maxNumberTest) {
            System.out.println("Test - OK");
        } else System.out.println("Test - FAIL");
    }

    void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayNumbers = 9;
        int[] arrayCreated = new int[arrayNumbers];
        arrayUtil.fillArrayWithRandomNumbers(arrayCreated);
        int minNumberTest = arrayCreated[0];
        for (int i = 1; i < arrayCreated.length; i++) {
            if (minNumberTest < arrayCreated[i]) {
                minNumberTest = arrayCreated[i];
            }
        }
        int minNumber = arrayUtil.findMinNumber(arrayCreated);
        System.out.println("Minimum number test");
        if (minNumber == minNumberTest) {
            System.out.println("Test - OK");
        } else System.out.println("Test - FAIL");
    }

    void findNumberArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = 10;
        int[] arrayTest = arrayUtil.createArray(arrayLength);
        arrayUtil.fillArrayWithRandomNumbers(arrayTest);
        int findNumber = arrayTest[4];
        System.out.println("Test - find number in array");
        System.out.println("Find number is " + findNumber);
        if (arrayUtil.findNumberInArray(arrayTest, findNumber) && arrayTest[4] == findNumber) {
            System.out.println("Test - OK");
        } else System.out.println("Test - FAIL");
    }

    void findNumberOfNumbersTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayTest = {1, 2, 3, 2, 4, 2};
        int findNumber = 2;
        int numberOfNumbers = 3;
        System.out.println("Test - find number of numbers in array");
        if (arrayUtil.findNumberOfNumbers(arrayTest, findNumber) == numberOfNumbers) {
            System.out.println("Test - OK");
        } else System.out.println("Test - FAIL");
    }

    void replaceTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayTest = {1, 2, 3, 3, 5};
        int changeNumber = 3;
        int newNumber = 1000;
        System.out.println("Test - change number");
        arrayUtil.replace(arrayTest, changeNumber, newNumber);
        if (arrayTest[2] == newNumber && arrayTest[3] != newNumber) {
            System.out.println("Test - OK");
        } else System.out.println("Test - FAIL");
    }

    void replaceAllTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayTest = {1, 2, 3, 3, 5};
        int changeNumber = 3;
        int newNumber = 1000;
        System.out.println("Test - change all numbers");
        arrayUtil.replaceAll(arrayTest, changeNumber, newNumber);
        if (arrayTest[2] == newNumber && arrayTest[3] == newNumber) {
            System.out.println("Test - OK");
        } else System.out.println("Test - FAIL");
    }
    void arrayReverseTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayTest = {1, 2, 3, 4, 5};
        int[] arrayTestOrigin = {5, 4, 3, 2, 1};
        arrayUtil.arrayReverse(arrayTest);
        System.out.println("Test reverse array");
        boolean param = false;
        for (int i = 0; i < arrayTest.length; i++) {
            if(arrayTest[i] == arrayTestOrigin[i]) {
                param = true;
            }
        }
        if(param) {
            System.out.println("Test - OK");
        } else System.out.println("Test - FAIL");
    }
}
