package com.javaguru.teacher.lesson_9.lessoncode.animals;

import java.math.BigDecimal;

class Worm extends Animal {

    public Worm(BigDecimal weight) {
        super(weight);
    }

    @Override
    void sound() {
        System.out.println("ffhshffhh");
    }
}
