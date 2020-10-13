package com.javaguru.teacher.lesson_9.lessoncode.students;

class StudentsDemo {

    public static void main(String[] args) {
        Student student = new Student();
        student.learn();
        System.out.println("===== JUNIOR");
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        juniorDeveloper.askQuestion();
        juniorDeveloper.debug();
        juniorDeveloper.learn();

        System.out.println("===== MID");
        MidDeveloper midDeveloper = new MidDeveloper();
        midDeveloper.askQuestion();
        midDeveloper.debug();
        midDeveloper.learn();
        midDeveloper.writeCode();

        System.out.println("===== SENIOR");
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();
        seniorDeveloper.askQuestion();
        seniorDeveloper.debug();
        seniorDeveloper.writeCode();
        seniorDeveloper.learn();
        seniorDeveloper.solveProblem();
    }
}
