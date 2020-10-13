package com.javaguru.teacher.lesson_9.lessoncode.services;

class Service {

    private final ServiceA serviceA;

    Service(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    void start() {
        Foo foo = new Foo();
        serviceA.something(foo);
    }
}
