package com.javaguru.student_vadim_migun.training;

class MyClass {

    private String s = "Hello World!";

    public String getS() {
        return s;
    }

    public void setS(String newValue) {
        s = newValue;
    }
}


class MyClassDemo {

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        System.out.println(myClass.getS());

        myClass.setS("It's modified!");
        System.out.println(myClass.getS());
    }
}
