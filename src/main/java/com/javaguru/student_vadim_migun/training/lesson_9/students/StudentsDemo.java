package com.javaguru.student_vadim_migun.training.lesson_9.students;

class StudentsDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.learn();
        System.out.println("=======Junior");
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        juniorDeveloper.askQuestion();
        juniorDeveloper.debug();
        juniorDeveloper.learn();


        System.out.println("=======Middle");
        MiddleDeveloper middleDeveloper = new MiddleDeveloper();
        middleDeveloper.askQuestion();
        middleDeveloper.debug();
        middleDeveloper.learn();
        middleDeveloper.writeCode();

        System.out.println("=======Senior");
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();
        seniorDeveloper.askQuestion();
        seniorDeveloper.debug();
        seniorDeveloper.writeCode();
        seniorDeveloper.learn();
        seniorDeveloper.solveProblem();
    }
}
