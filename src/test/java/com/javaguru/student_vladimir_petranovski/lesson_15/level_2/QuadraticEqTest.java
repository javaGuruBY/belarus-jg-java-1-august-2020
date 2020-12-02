package com.javaguru.student_vladimir_petranovski.lesson_15.level_2;

import junit.framework.TestCase;

public class QuadraticEqTest extends TestCase {

    private final QuadraticEq test = new QuadraticEq();

    public void testCalcDistinctGreaterThanZero() {
        double a = 4;
        double b = 5;
        double c = 1;
        double discriminant = b * b - 4 * a * c;
        assertEquals("x1 = -1.0, x2 = -0.25", test.calc(a, b, c));
    }

    public void testCalcDistinctEqualsZero() {
        double a = 1;
        double b = 2;
        double c = 1;
        assertEquals("x = -1.0", test.calc(a, b, c));
    }

    public void testCalcDistinctLessThanZero() {
        double a = 5;
        double b = 2;
        double c = 1;
        assertEquals("Equation has no roots", test.calc(a, b, c));
    }



//    public void testDiscriminantGreaterThanZero() {
//        double a = 4;
//        double b = 5;
//        double c = 1;
//        double discriminant = b * b - 4 * a * c;
//        assertEquals("x1 = -1.0, x2 = -0.25", test.discriminantGreaterThanZero(4, 5, 9));
//    }
//
//    public void testDiscriminantEqualsZero() {
//        double a = 1;
//        double b = 2;
//        assertEquals("x = -1.0", test.discriminantEqualsZero(a, b));
//    }
//
//    public void testDiscriminantLessThanZero() {
//        assertEquals("Equation has no roots", test.discriminantLessThanZero());
//    }
}