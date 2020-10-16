package com.javaguru.student_vadim_migun.lesson_9.level_3.task_13;

class CarDemo {

    public static void main(String[] args) {

        Sedan sedan = new Sedan("Honda accord", "black");
        System.out.println(sedan.toString());
        sedan.gas();
        sedan.brake();
        System.out.println();

        Hatchback hatchback = new Hatchback("Honda civic", "white");
        System.out.println(hatchback.toString());
        hatchback.gas();
        hatchback.brake();

    }
}
