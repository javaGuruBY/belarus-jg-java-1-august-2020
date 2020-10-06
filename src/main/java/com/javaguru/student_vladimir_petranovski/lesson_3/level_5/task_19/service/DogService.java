package com.javaguru.student_vladimir_petranovski.lesson_3.level_5.task_19.service;

import com.javaguru.student_vladimir_petranovski.lesson_3.level_5.task_19.bean.Dog;

public class DogService {
    public void voice(Dog dog) {
        System.out.println("Кличка: " + dog.getName() + " возраст: " + dog.getAge());
    }
}
