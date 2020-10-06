package com.javaguru.student_vadim_migun.training;


class RobotTest {

        public void sayHello () {
        System.out.println("Hello!");
        }

        private String name;

        public RobotTest(String robotName) {
        this.name = robotName; // а тут робот запоминает в своем свойстве this.name как его зовут
        }

        public void sayYourName () {
            System.out.println("My name is " + name + "!");
        }


    }


class RobotTestDemo {
    public static void main(String[] args) {

        RobotTest robot1 = new RobotTest("Rider");
        robot1.sayHello();
        robot1.sayYourName();

        RobotTest robot2 = new RobotTest("John");
        robot2.sayHello();
        robot2.sayYourName();

        RobotTest myRobot = new RobotTest ("Vadim");
        myRobot.sayHello();
        myRobot.sayYourName();

        System.out.println(robot1);
        System.out.println(robot2);
        System.out.println(myRobot);

    }

}
/*
В классе RobotDemo передайте в конструктор каждого робота его название:

Robot robot1 = new Robot("Rider"); // пусть этого робота зовут "Rider"
robot1.sayHello();
robot1.sayYourName();

Robot robot2 = new Robot("John"); // а этого робота зовут "John"
robot2.sayHello();
robot2.sayYourName();

 */