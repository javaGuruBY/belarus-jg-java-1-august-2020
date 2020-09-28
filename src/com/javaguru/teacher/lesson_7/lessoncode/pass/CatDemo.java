package com.javaguru.teacher.lesson_7.lessoncode.pass;

class CatDemo {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("A");

        System.out.println(cat); // name = A
        foo(cat);
        System.out.println(cat); // name = ?
        foo1(cat);
        System.out.println(cat);

        int a = 1;
        System.out.println(a); // a = 1
        bar(a);
        System.out.println(a); // a = 1
    }

    private static void foo(Cat c) {
        c.setName("B");
    }

    private static void foo1(Cat c) {
        c = new Cat();
        c.setName("C");
        System.out.println("NEW CAT: " + c);
    }

    private static void bar(int number) {
        System.out.println("BAR " + number);
        number = 10;
        System.out.println("BAR " + number);
    }
}
