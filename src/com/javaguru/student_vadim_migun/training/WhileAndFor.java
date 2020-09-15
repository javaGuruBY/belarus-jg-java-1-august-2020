package com.javaguru.student_vadim_migun.training;

class WhileAndFor {
    public static void main(String[] args) {
        int x = 21;
        while (x>12) {
            x = x-1;
            System.out.println("x равен = " + x);
        }
        System.out.println();
        for (x = 0; x < 10; x++) {
            System.out.println("Теперь х равен " + x);
        }
    }
}
