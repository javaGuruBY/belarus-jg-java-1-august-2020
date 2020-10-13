package com.javaguru.student_vladimir_petranovski.lesson_9.level_2.task_7;

class Man extends Person {
    private static String name = "Vova";
    private static int age = 36;

    public Man(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person man = new Man(name, age);
        System.out.println(man.toString());
    }
}
