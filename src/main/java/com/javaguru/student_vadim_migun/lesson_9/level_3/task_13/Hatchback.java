package com.javaguru.student_vadim_migun.lesson_9.level_3.task_13;

class Hatchback extends Car {

    public Hatchback(String model, String color) {
        super(model, color);
    }

    @Override
    public void gas() {
//        super.gas();
        System.out.println("Hatchback accelerate!");
    }

    @Override
    public void brake() {
//        super.brake();
        System.out.println("Hatchback brake!");
     }
}
