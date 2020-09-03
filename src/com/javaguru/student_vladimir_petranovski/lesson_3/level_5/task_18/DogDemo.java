package com.javaguru.student_vladimir_petranovski.lesson_3.level_5.task_18;

import com.javaguru.student_vladimir_petranovski.lesson_3.level_5.task_18.bean.Dog;
import com.javaguru.student_vladimir_petranovski.lesson_3.level_5.task_18.service.DogService;

public class DogDemo {
    public static void main(String[] args) {
        DogService dogService = new DogService();
        Dog dog = new Dog();
        dogService.voice(dog);
    }
}
