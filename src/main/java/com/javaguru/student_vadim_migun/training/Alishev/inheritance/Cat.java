package com.javaguru.student_vadim_migun.training.Alishev.inheritance;

class Cat extends Animal {

    @Override
    public void sleep() {
//        super.sleep();
        System.out.println("Cat is sleeping");

    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }


    public void voice() {
        System.out.println("Meow-meow");
    }
}
