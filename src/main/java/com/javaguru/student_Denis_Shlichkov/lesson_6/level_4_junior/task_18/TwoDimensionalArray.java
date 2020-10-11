package lesson_6.level_4_junior.task_18;

class TwoDimensionalArray {
    void createArrayMatrix(int [] [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i] [j] = (int) (Math.random() * 101);
            }
        }
    }

    int amountNumbersOfArray(int [][] array) {
        int amountNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                amountNumbers += array[i][j];
            }
        }
        return amountNumbers;
    }
}
