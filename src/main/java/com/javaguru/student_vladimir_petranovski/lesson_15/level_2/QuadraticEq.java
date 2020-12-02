package com.javaguru.student_vladimir_petranovski.lesson_15.level_2;
/*
class QuadraticEq {

    public void calc(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (discriminant == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("x = " + x);
        }
        else {
            System.out.println("Equation has no roots");
        }
    }

}*/

//class QuadraticEq {
//
//    public void calc(double a, double b, double c) {
//        double discriminant = b * b - 4 * a * c;
//        if (discriminant > 0) {
//            discriminantGreaterThanZero(a, b, discriminant);
//        }
//        else if (discriminant == 0) {
//            discriminantEqualsZero(a, b);
//        }
//        else {
//            discriminantLessThanZero();
//        }
//    }
//
//    public void discriminantGreaterThanZero(double a, double b, double discriminant) {
//        double x1, x2;
//        x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
//        x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
//        System.out.println("x1 = " + x1 + ", x2 = " + x2);
//    }
//
//    public void discriminantEqualsZero(double a, double b) {
//        double x;
//        x = -b / (2 * a);
//        System.out.println("x = " + x);
//    }
//
//    public void discriminantLessThanZero() {
//        System.out.println("Equation has no roots");
//    }
//}

class QuadraticEq {

    public String calc(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            return discriminantGreaterThanZero(a, b, discriminant);
        }
        else if (discriminant == 0) {
            return discriminantEqualsZero(a, b);
        }
        else {
            return discriminantLessThanZero();
        }
    }

    private String discriminantGreaterThanZero(double a, double b, double discriminant) {
        double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        return "x1 = " + x1 + ", x2 = " + x2;
    }

    private String discriminantEqualsZero(double a, double b) {
        double x = -b / (2 * a);
        return "x = " + x;
    }

    private String discriminantLessThanZero() {
        return "Equation has no roots";
    }

}
