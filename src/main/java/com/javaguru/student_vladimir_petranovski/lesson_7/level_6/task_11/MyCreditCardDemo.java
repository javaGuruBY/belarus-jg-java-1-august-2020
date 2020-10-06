package com.javaguru.student_vladimir_petranovski.lesson_7.level_6.task_11;

import com.javaguru.student_vladimir_petranovski.lesson_7.level_6.task_11.bean.MyCreditCard;
import com.javaguru.student_vladimir_petranovski.lesson_7.level_6.task_11.service.MyCreditCardService;

class MyCreditCardDemo {
    public static void main(String[] args) {
        MyCreditCardService myCreditCardService = new MyCreditCardService();
        MyCreditCard myCreditCard = new MyCreditCard(12345, 54321);
        myCreditCard.setCreditLimit(1000);
        System.out.println(myCreditCardService.deposit(myCreditCard, 54321, 500));
        System.out.println(myCreditCardService.withdraw(myCreditCard, 123, 700));
        System.out.println(myCreditCardService.withdraw(myCreditCard, 54321, 700));
    }
}
