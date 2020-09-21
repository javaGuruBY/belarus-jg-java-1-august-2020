/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведети их на консоль.
 */
package lesson_5.level_4_junior.task_30;

class TaskThirty {
    public static void main(String[] args) {
        int numbersOfArray = (int) (Math.random() * 11);
        System.out.println("Numbers of array " + numbersOfArray);

        int[] newArray = new int[numbersOfArray];
        
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (int) (Math.random() * 101);
            System.out.println("Number [" + i + "] = " + newArray[i]);
        }
//вывод нечётных чисел массива
        System.out.println("Нечётные числа в массиве:");
        for (int j : newArray) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }

    }
}
