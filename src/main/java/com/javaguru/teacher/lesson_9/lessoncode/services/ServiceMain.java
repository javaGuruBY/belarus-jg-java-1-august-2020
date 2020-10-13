package com.javaguru.teacher.lesson_9.lessoncode.services;

class ServiceMain {

    public static void main(String[] args) {
        ServiceB serviceB = new ServiceB();
        ServiceA serviceA = new ServiceA(serviceB);
        Service service = new Service(serviceA);
        service.start();
    }
}
