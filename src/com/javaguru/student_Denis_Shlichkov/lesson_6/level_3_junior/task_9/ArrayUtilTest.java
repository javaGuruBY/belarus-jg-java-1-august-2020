package lesson_6.level_3_junior.task_9;

import java.util.Arrays;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayReference = new int[9];
        int [] arrayCreated = arrayUtil.createArray(9);
        //проверка на количество элементов
        System.out.println("If the arrays are the same");
        if (arrayReference.length == arrayCreated.length) {
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
        int [] arrayReferenceSecond = new int[10];
        int [] arrayCreatedSecond = arrayUtil.createArray(9);
        //проверка на количество элементов
        System.out.println("If the arrays are different");
        if (arrayReferenceSecond.length != arrayCreatedSecond.length) {
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayNumbers = 9;
        int [] arrayReference = arrayUtil.createArray(arrayNumbers);
        int [] arrayCreated = new int[arrayNumbers];
        //заполнение эталонного массива случайными элементами
        for (int i = 0; i < arrayNumbers; i++) {
            arrayReference[i] = (int) (Math.random() * 101);
        }
        arrayUtil.fillArrayWithRandomNumbers(arrayCreated);
        System.out.println("Test arrays to fill with random numbers");
        if (Arrays.equals(arrayCreated, arrayReference)) {
            System.out.println("Test - FAIL");
        }
        else System.out.println("Test - OK");
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayNumbers = 9;
        int [] arrayCreated = new int[arrayNumbers];
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
        }
        else System.out.println("Test - FAIL");
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayNumbers = 9;
        int [] arrayCreated = new int[arrayNumbers];
        arrayUtil.fillArrayWithRandomNumbers(arrayCreated);
        int minNumberTest = arrayCreated[0];
        for (int i = 1; i < arrayCreated.length; i++) {
            if (minNumberTest < arrayCreated[i]) {
                minNumberTest = arrayCreated[i];
            }
        }
        int minNumber = arrayUtil.findMinNumber(arrayCreated);
        System.out.println("Maximum number test");
        if (minNumber == minNumberTest) {
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");
    }
}
