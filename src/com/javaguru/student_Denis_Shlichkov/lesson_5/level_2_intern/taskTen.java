/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива любым числом,
 - вывести значение каждой ячейки на консоль.

 */
package lesson_5.level_2_intern;

class taskTen {
    public static void main(String[] args) {
        int [] newArray = new int[3];
        //в одном цикле заполнение массива случайными числами и вывод на экран
        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = (int) (Math.random() * 11);
            System.out.println(newArray[i]);
        }
    }
}
