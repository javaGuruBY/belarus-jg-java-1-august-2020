package com.javaguru.teacher.lesson_9.lessoncode;

class BicycleDemo {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("First", 10);
        MountainBicycle mountainBicycle = new MountainBicycle("Second", 20, 3);

//        System.out.println(bicycle);
//
//        bicycle.accelerate();
//
//        System.out.println(bicycle);

        System.out.println(mountainBicycle);

        mountainBicycle.accelerate();

        System.out.println(mountainBicycle);
    }
}
