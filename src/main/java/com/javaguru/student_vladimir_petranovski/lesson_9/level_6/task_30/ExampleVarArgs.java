package com.javaguru.student_vladimir_petranovski.lesson_9.level_6.task_30;
/*
Узнать в интернете, что такое varargs.
Придумайте пример кода, в котором продемонстрируйте
использование varargs.
 */

class ExampleVarArgs {
    private void addAll(String s, String...name) {
        for (int i = 0; i < name.length; i++) {
            System.out.println(s + ", " + name[i] + ".");
        }
    }

    public static void main(String[] args) {
        ExampleVarArgs e = new ExampleVarArgs();
        e.addAll("Hello!", "Vova");
        e.addAll("Bye", "Andrei", "Vadim", "Sergei", "Denis");
    }

}
