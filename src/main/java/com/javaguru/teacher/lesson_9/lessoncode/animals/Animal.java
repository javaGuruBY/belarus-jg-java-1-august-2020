package com.javaguru.teacher.lesson_9.lessoncode.animals;

import java.math.BigDecimal;

abstract class Animal {

    private BigDecimal weight;

    public Animal(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    abstract void sound();
}
