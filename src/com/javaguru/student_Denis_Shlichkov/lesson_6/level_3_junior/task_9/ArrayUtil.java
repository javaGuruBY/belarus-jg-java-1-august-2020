package lesson_6.level_3_junior.task_9;

class ArrayUtil {
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int j : array) {
            System.out.println(array[j]);
        }
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxNumber > array[i]) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minNumber < array[i]) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }
}
