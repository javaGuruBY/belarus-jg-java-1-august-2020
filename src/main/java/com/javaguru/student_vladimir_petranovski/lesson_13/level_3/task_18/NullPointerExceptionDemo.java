package com.javaguru.student_vladimir_petranovski.lesson_13.level_3.task_18;
/*
Создайте класс NullPointerExceptionDemo
и в main() методе этого класса напишите код,
который приводит к появлению NullPointerException.
В комментариях напишите, когда происходит NullPointerException.
 */

class NullPointerExceptionDemo {

    public static void main(String[] args) {
        String str = null;
        String str1 = str.substring(0, 3);
        System.out.println(str1);
        // Когда вы объявляете ссылочную переменную (то есть объект),
        // вы действительно создаете указатель на объект.
        //Когда вы пытаетесь использовать указатель на ничто, программа
        //выбрасывает ошибку NullPointerException, ведь нельзя использовать НИЧТО.
    }
}
