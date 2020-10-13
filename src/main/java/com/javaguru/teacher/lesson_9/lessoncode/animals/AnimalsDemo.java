package com.javaguru.teacher.lesson_9.lessoncode.animals;

import java.math.BigDecimal;
import java.math.RoundingMode;

class AnimalsDemo {

    public static void main(String[] args) {
        BigDecimal dogWeight = new BigDecimal("1.74");
        Dog dog = new Dog(dogWeight);
        dog.sound();

        BigDecimal catWeight = new BigDecimal("1.10");
        Cat cat = new Cat(catWeight);
        cat.sound();

        Worm worm = new Worm(new BigDecimal("0.01"));
        worm.sound();

        Animal firstAnimal = new Dog(new BigDecimal("2.2350"));
        Animal secondAnimal = new Cat(new BigDecimal("1.5"));
        Animal thirdAnimal = new Worm(new BigDecimal("0.02"));

        Animal[] animals = new Animal[6];
        animals[0] = firstAnimal;
        animals[1] = secondAnimal;
        animals[2] = thirdAnimal;
        animals[3] = cat;
        animals[4] = dog;
        animals[5] = worm;

        for (Animal animal : animals) {
            animal.sound();
        }

        BigDecimal totalWeight = BigDecimal.ZERO;

        for (Animal animal : animals) {
            totalWeight = totalWeight.add(animal.getWeight());
        }

        System.out.println("Total weight: " + totalWeight.setScale(2, RoundingMode.HALF_EVEN));

        BigDecimal bigDecimal = new BigDecimal("2.5")
                .setScale(0, RoundingMode.HALF_EVEN);
        System.out.println(bigDecimal);
    }
}
