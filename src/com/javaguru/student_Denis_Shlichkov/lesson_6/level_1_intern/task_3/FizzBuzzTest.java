package lesson_6.level_1_intern.task_3;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        System.out.println("Test FizzBuzz");
        fizzBuzzTest.testFizzBuzz();
        System.out.println();

        System.out.println("Test FizzBuzzOptimized");
        fizzBuzzTest.testFizzBuzzOptimized();
    }

    void testFizzBuzz () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(25).equals("Buzz")) {
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");
        if (fizzBuzz.detect(30).equals("FizzBuzz")) {
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");
        if (fizzBuzz.detect(3).equals("Fizz")) {
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");
        if (fizzBuzz.detect(4).equals("4")) {
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");
        if (fizzBuzz.detect(4).equals("4")) {
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");
    }

    void testFizzBuzzOptimized () {
        FizzBuzzOptimized fizzBuzzOptimized = new FizzBuzzOptimized();
        if (fizzBuzzOptimized.detect(25).equals("Buzz")) {
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");
        if (fizzBuzzOptimized.detect(30).equals("FizzBuzz")) {
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");
        if (fizzBuzzOptimized.detect(3).equals("Fizz")) {
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");
        if (fizzBuzzOptimized.detect(4).equals("4")) {
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");
        if (fizzBuzzOptimized.detect(4).equals("4")) {
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");
    }
}
