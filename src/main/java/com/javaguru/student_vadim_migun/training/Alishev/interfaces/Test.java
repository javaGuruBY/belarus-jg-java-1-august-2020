package com.javaguru.student_vadim_migun.training.Alishev.interfaces;

class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        outputInfo(animal1);
        outputInfo(person1);

    }
        public static void outputInfo(Info info){
            info.showInfo();
        }

/*        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        animal1.showInfo();
        person1.showInfo();
*/

}
