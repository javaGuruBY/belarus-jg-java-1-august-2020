package com.javaguru.student_Denis_Shlichkov.lesson_;


class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
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
        if (arrayCreated.equals(arrayReference)) {
            System.out.println("Test - FAIL");
        }
        else System.out.println("Test - OK");
    }

}
