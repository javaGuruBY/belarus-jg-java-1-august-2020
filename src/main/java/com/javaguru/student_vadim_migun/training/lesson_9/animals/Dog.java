package com.javaguru.student_vadim_migun.training.lesson_9.animals;

import java.math.BigDecimal;

class Dog extends Animal {

    public Dog(BigDecimal weight) {
        super(weight);
    }

    @Override
    void sound() {
        System.out.println("gav-gav");

    }
}
