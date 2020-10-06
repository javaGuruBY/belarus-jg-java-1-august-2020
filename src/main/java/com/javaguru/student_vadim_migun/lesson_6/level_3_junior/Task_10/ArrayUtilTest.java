package com.javaguru.student_vadim_migun.lesson_6.level_3_junior.Task_10;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "удаляйте неиспользованные переменные")
public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.countNumberTest1();
        test.countNumberTest2();
        test.countNumberTest3();

    }

    ArrayUtil array = new ArrayUtil();
 //   int [] arr = {0, 1, 2, 3, 3, 2, 2};

    public void countNumberTest1(){
        int expected = 3;
        int actual = array.countNumber(2);
        checkResult(expected == actual, "countNumberTest1");

    }

    public void countNumberTest2(){
        int expected = 2;
        int actual = array.countNumber(3);
        checkResult(expected == actual, "countNumberTest2");

    }

    public void countNumberTest3(){
        int expected = 1;
        int actual = array.countNumber(1);
        checkResult(expected == actual, "countNumberTest3");

    }


    public void checkResult (boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = SUCCESS");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
