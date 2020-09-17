/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль,
 - увеличить значение каждой ячейки на 2,
 - вывести значение каждой ячейки на консоль.
*/
package lesson_5.level_2_intern;

class taskFifteen {
    public static void main(String[] args) {
        int[] newArray = new int[3];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (int) (Math.random() * 10);
        }

        output(newArray);

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray[i] * 2;
        }

        output(newArray);

    }
    static void output(int[] arrayNew){
        for (int j : arrayNew) {
            System.out.println(j);
        }
    }
}


