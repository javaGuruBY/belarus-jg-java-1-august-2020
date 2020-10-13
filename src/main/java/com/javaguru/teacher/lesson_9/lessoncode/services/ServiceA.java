package com.javaguru.teacher.lesson_9.lessoncode.services;

class ServiceA {

    private final ServiceB serviceB;

    ServiceA(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    void something(Foo foo) {
        foo.setA("ABC");
        serviceB.bar(foo);
    }
}
