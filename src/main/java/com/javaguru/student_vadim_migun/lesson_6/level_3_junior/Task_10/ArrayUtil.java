package com.javaguru.student_vadim_migun.lesson_6.level_3_junior.Task_10;

import com.javaguru.teacher.codereview.CodeReview;

/*
Добавьте в класс ArrayUtil метод для проверки сколько раз содержит массив целых чисел указынное число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.
 */
@CodeReview(approved = true)
class ArrayUtil {
    public int countNumber (int number) {
        int [] arr = {0, 1, 2, 3, 3, 2, 2};
        int count = 0;
        for (int i : arr) {
            if (number == i) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(new ArrayUtil().countNumber(2));
    }
}
