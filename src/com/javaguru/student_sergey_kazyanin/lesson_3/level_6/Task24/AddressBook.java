package com.javaguru.student_sergey_kazyanin.lesson_3.level_6.Task24;

class AddressBook {
    private String firstName;
    private String lastName;
    private String mobile;

    public AddressBook(String firstName, String lastName, String mobile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
    }

    public void sendMessage() {
        System.out.println("Отправка сообщения абоненту <" + firstName + " " + lastName + "> прошла успешно!");
    }

    public void PhoneNumberInfo() {
        System.out.println("phone: " + mobile);
    }


}
