package com.javaguru.student_vadim_migun.training.lesson_9.animals;

import java.math.BigDecimal;

class Cat extends Animal {

    public Cat(BigDecimal weight) {
        super(weight);
    }

    @Override
    void sound() {
        System.out.println("meow-meow");
    }
}
