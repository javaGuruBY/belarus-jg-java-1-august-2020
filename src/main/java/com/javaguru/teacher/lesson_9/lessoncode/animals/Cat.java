package com.javaguru.teacher.lesson_9.lessoncode.animals;

import java.math.BigDecimal;

class Cat extends Animal {

    public Cat(BigDecimal weight) {
        super(weight);
    }

    @Override
    void sound() {
        System.out.println("Meow meow");
    }
}
