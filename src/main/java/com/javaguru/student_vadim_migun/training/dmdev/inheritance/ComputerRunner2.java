package com.javaguru.student_vadim_migun.training.dmdev.inheritance;

import com.javaguru.student_vadim_migun.training.dmdev.interfaces.Printable;

class ComputerRunner2 {

    public static void main(String[] args) {
        Laptop laptop = new Laptop(new Ssd(250), new Ram(512),2);

        print(laptop);

    }

    public static void print(Printable...objects){
        for (Printable object : objects) {
            object.print();

        }

    }
}
