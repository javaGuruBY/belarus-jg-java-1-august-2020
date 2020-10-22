package com.javaguru.student_vadim_migun.training.lesson_9.animals;

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
