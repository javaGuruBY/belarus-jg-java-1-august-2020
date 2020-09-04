package com.javaguru.student_vladimir_petranovski.lesson_3.level_5.task_19;

import com.javaguru.student_vladimir_petranovski.lesson_3.level_5.task_19.bean.Dog;
import com.javaguru.student_vladimir_petranovski.lesson_3.level_5.task_19.service.DogService;

public class DogDemo {
    public static void main(String[] args) {
        DogService dogService = new DogService();
        Dog dog = new Dog();
        dog.setAge((byte) 3);
        dog.setName("Вов");
        dogService.voice(dog);
    }
}
