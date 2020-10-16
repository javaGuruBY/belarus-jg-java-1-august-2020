package com.javaguru.student_vadim_migun.training.Alishev.inheritance;

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void bark() {
        System.out.println("Gav-gav");
    }

    public void showName(){
        System.out.println(name);
    }


}
