package com.javaguru.student_vadim_migun.training.Alishev.interfaces;

class Animal implements Info{
    public int id;

    public Animal(int id){
        this.id = id;
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }

    public void showInfo(){
        System.out.println("Id is " + this.id);
    }

}
