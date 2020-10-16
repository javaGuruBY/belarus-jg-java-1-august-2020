package com.javaguru.student_vadim_migun.lesson_9.level_3.task_13;

class Sedan extends Car {

    public Sedan(String model, String color) {
        super(model, color);
    }

    @Override
    public void gas() {
 //       super.gas();
        System.out.println("Sedan accelerate!");
    }

    @Override
    public void brake() {
 //       super.brake();
        System.out.println("Sedan brake!");
    }
}
