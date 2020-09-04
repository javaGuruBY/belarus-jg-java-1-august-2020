package com.javaguru.student_vladimir_petranovski.lesson_3.level_5.task_20.service;

import com.javaguru.student_vladimir_petranovski.lesson_3.level_5.task_20.bean.DogBirthday;

public class DogBirthdayService {
    public void voice(DogBirthday dogBirthday) {
        System.out.println("Гав-гав");
    }
    public void happyBirthday(DogBirthday dogBirthday) {
        System.out.println("It's birthday again today " + (dogBirthday.getAge() + 1));
    }
}
