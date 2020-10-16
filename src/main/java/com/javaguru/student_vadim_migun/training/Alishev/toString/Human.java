package com.javaguru.student_vadim_migun.training.Alishev.toString;

class HumanDemo {

    public static void main(String[] args) {

        Human h1 = new Human("Vadim", 27);
        System.out.println(h1);
        Human h2 = new Human("Vasya", 30);
        System.out.println(h2);

    }
}


class Human {

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ", " + age;
    }

}





