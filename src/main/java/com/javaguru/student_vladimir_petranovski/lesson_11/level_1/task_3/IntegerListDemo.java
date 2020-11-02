package com.javaguru.student_vladimir_petranovski.lesson_11.level_1.task_3;
/*
В классе IntegerListDemo создайте список целых чисел.
Продемонстрируйте как:
- добавить в список элемент (в начало и в конец)
- узнать длину списка
- удалить элемент из списка (по интексу и без)
- узнать пустой список или нет
- обойти список и вывести на консоль каждый элемент.
 */

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(0, 3); // добавляем в начало
        number.add(5);// добавляем в конец
        number.add(0, 7);
        number.add(9);
        System.out.println(number.size()); // длина списка
        number.remove(2); //удаляем по индексу
        number.remove((Integer)9); // удаляем без индекса, по ссылке на обьект

        System.out.println(number.isEmpty()); //узнаем пустой список или нет
        for (Integer integer : number) { // обходим список и выводим на консоль все элементы
            System.out.println(integer);
        }

        System.out.println(number.get(0)); //получаем элемент по индексу


    }

}
