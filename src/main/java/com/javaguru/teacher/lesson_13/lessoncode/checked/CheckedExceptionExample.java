package com.javaguru.teacher.lesson_13.lessoncode.checked;

class CheckedExceptionExample {

    public static void main(String[] args) {
        CheckExceptionService service = new CheckExceptionService();

        try {
            service.shouldThrowException();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
//            throw new RuntimeException(exception);
        }
    }
}
