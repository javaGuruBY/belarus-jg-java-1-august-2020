package com.javaguru.teacher.lesson_9.lessoncode.animals;

import java.math.BigDecimal;

class Dog extends Animal {

    public Dog(BigDecimal weight) {
        super(weight);
    }

    @Override
    void sound() {
        System.out.println("Gav gav");
    }
}
