package com.javaguru.student_vadim_migun.lesson_3.level_3;

/*
 class Robot {

     public Robot () {
     }
    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayYourName() {
        System.out.println("My name is ROBO1");
    }
    public void sayYourName2() {
        System.out.println("My name is ROBO2");
    }
}
 */

class RobotVersion2 {

    private String name;

    RobotVersion2(String robotName) {
        this.name = robotName;
    }

        public void sayHello() {
            System.out.println("Hello!");

        }
        public void sayYourName() {
            System.out.println("My name is " + name);
        }


    }

    /*
    class RobotDemo {
    public static void main(String[] args) {

        Robot Robot1 = new Robot();
        Robot1.sayHello();
        Robot1.sayYourName();

        Robot Robot2 = new Robot();
        Robot2.sayHello();
        Robot2.sayYourName2();

        System.out.println(Robot1);
        System.out.println(Robot2);
    }
}
     */

class RobotVersion2Demo {
    public static void main(String[] args) {

        RobotVersion2 robot1 = new RobotVersion2("Rider"); // пусть этого робота зовут "Rider"
        robot1.sayHello();
        robot1.sayYourName();

        RobotVersion2 robot2 = new RobotVersion2("John"); // а этого робота зовут "John"
        robot2.sayHello();
        robot2.sayYourName();
    }

}
