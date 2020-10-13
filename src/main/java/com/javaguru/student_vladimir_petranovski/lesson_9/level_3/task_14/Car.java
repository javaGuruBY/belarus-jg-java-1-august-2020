package com.javaguru.student_vladimir_petranovski.lesson_9.level_3.task_14;
/*
Исправьте код программы так, что бы он компилировался.
Класс Car менять нельзя.
Классы ElectricCar и PetrolCar должны наследоваться
от класса Car.


abstract class Car {

    abstract void accelerate();

}

class ElectricCar extends Car {

    private int batteryCharge;


}

class PetrolCar extends Car {

    private double petrolTankCapacity;

}
 */

abstract class Car {
    abstract void accelerate();

}

class ElectricCar extends Car {

    private int batteryCharge;

    @Override
    void accelerate() {

    }
}

class PetrolCar extends Car {

    private double petrolTankCapacity;

    @Override
    void accelerate() {

    }
}
