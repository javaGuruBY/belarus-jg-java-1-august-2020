package com.javaguru.student_vadim_migun.training.lesson_9.animals;

import java.math.BigDecimal;

class Worm extends Animal {

    public Worm(BigDecimal weight) {
        super(weight);
    }

    @Override
    void sound() {
        System.out.println("ffssfsf");
    }
}
