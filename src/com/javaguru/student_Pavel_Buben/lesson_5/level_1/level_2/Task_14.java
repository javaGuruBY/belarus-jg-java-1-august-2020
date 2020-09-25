package com.javaguru.student_Pavel_Buben.lesson_5.level_1.level_2;

    import java.util.Random;

    class Task_14 {
        public static void main(String[] args) {
            int[] numbers = new int[3];
            Random random = new Random();
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100);
                System.out.println(numbers[i]);
            }
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            int average = sum / numbers.length;
            System.out.println();
            System.out.println("Среднее значение ячеек массива " + average);
        }
}
