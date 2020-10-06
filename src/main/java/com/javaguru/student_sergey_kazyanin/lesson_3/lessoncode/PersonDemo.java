package com.javaguru.student_sergey_kazyanin.lesson_3.lessoncode;

class PersonDemo {
    public static void main(String[] args) {
        Person firstPerson = new Person("Sergey", 27);

        String personName = firstPerson.getName();
        int personAge = firstPerson.getAge();

        System.out.println("Person name: " + personName);
        System.out.println("Person age: " + personAge);

        Person oldPerson = new Person(firstPerson.getName(), firstPerson.getAge() + 1);
        System.out.println("Old person name: " + oldPerson.getName());
        System.out.println("Old person age: " + oldPerson.getAge());
    }
}
