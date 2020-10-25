package com.javaguru.student_vadim_migun.training.lesson_9.animals;

import java.math.BigDecimal;

class AnimalsDemo {

    public static void main(String[] args) {
        BigDecimal dogWeight = new BigDecimal(1.74);
        Dog dog = new Dog(dogWeight);
        dog.sound();

        BigDecimal catWeight = new BigDecimal(1.1);
        Cat cat = new Cat(catWeight);
        cat.sound();

        Worm worm = new Worm(new BigDecimal(0.01));
        worm.sound();


        Animal firstAnimal = new Dog(new BigDecimal(2.2));
        Animal secondAnimal = new Cat(new BigDecimal(1.3));
        Animal thirdAnimal = new Worm(new BigDecimal(0.01));

        Animal[] animals = new Animal[3];
        animals[0] = firstAnimal;
        animals[1] = secondAnimal;
        animals[2] = thirdAnimal;

        for(Animal animal : animals) {
            animal.sound();
        }
    }
}
