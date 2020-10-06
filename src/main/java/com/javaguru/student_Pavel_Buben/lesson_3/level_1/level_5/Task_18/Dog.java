package com.javaguru.student_Pavel_Buben.lesson_3.level_1.level_5.Task_18;

class Dog {

        private String name;
        public Dog(String name) {
            this.name = name;
        }
        public String getName() {
        return name;
        }
        public void voice() {
            for(int i = 1; i < 3; i++)
            System.out.println(name);

        }



}
