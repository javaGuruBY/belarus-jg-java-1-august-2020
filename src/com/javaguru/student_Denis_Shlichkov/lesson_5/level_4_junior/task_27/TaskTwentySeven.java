/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.
 */
package lesson_5.level_4_junior.task_27;


public class TaskTwentySeven {
    public static void main(String[] args) {
        int numbersOfArray = (int) (Math.random() * 11);
        System.out.println("Numbers of array " + numbersOfArray);

        int[] newArray = new int[numbersOfArray];
// решение за один цикл
        int maximumElement = 0;// необходимо задать значение, иначе ругается на неопределённую переменную
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (int) (Math.random() * 101);
            System.out.println("Number [" + i + "] = " + newArray[i]);
            if (i == 0) {
                maximumElement = newArray[0];
            }
            else {
                if (maximumElement >= newArray[i]) {
                    continue;
                }
                maximumElement = newArray[i];
            }
        }

        System.out.println("Maximum element of array is " + maximumElement);
/*     решение в два цикла
        int maximumElement = newArray[0];
        for (int i = 1; i < newArray.length; i++) {
            if (maximumElement < newArray[i]) {
                maximumElement = newArray[i];
            }
        }*/
    }
}
