package com.javaguru.student_vadim_migun.training;

class Arrays {
    public static void main(String[] args) {

        int[] numbers = new int[7];
        for (int i=0; i<numbers.length; i++){
            numbers[i] = i*10;
        }
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();

        int [] numbers1 = {1,2,3,4,5};
        for (int i=0; i<numbers1.length; i++){
            System.out.println("Ячейки массива - " + numbers1[i]);
        }
    }
}
