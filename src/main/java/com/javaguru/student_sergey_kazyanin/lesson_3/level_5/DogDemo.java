package com.javaguru.student_sergey_kazyanin.lesson_3.level_5;

class DogDemo {
    public static void main(String[] args) {
        Dog dogOne = new Dog("Tom", 7, "black");

        dogOne.voice();
        dogOne.happyBirthday();
        dogOne.changeColor("Red");
        dogOne.voice();
    }
}
