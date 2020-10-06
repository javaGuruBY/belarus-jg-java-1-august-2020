package com.javaguru.student_vladimir_petranovski.lesson_3.level_5.task_20;

import com.javaguru.student_vladimir_petranovski.lesson_3.level_5.task_20.bean.DogBirthday;
import com.javaguru.student_vladimir_petranovski.lesson_3.level_5.task_20.service.DogBirthdayService;

public class DogBirthdayDemo {
    public static void main(String[] args) {
        DogBirthdayService dogBirthdayService = new DogBirthdayService();
        DogBirthday dogBirthday = new DogBirthday();
        dogBirthday.setAge(5);
        dogBirthdayService.voice(dogBirthday);
        dogBirthdayService.happyBirthday(dogBirthday);
        dogBirthdayService.voice(dogBirthday);
        dogBirthdayService.happyBirthday(dogBirthday);
    }
}
