/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать сумму всех ячеек и вывести ее на консоль.

 */
package lesson_5.level_2_intern;

class taskThirteen {
    public static void main(String[] args) {
        int [] newArray = new int[3];
        int sum = 0;
        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = (int) (Math.random() * 11);
            System.out.println(newArray[i]);
            sum = sum + newArray[i];
        }
        System.out.println("Sum = " + sum);
    }
}
