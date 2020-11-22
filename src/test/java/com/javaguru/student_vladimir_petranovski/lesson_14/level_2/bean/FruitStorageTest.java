package com.javaguru.student_vladimir_petranovski.lesson_14.level_2.bean;

import com.javaguru.student_vladimir_petranovski.lesson_14.level_1.bean.AppleWeightConstance;
import com.javaguru.student_vladimir_petranovski.lesson_14.level_2.service.*;
import junit.framework.TestCase;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

public class FruitStorageTest extends TestCase {

    private FruitStorage test;
    private final List<Apple> testList = new ArrayList<>();

    @Before
    public void setUp() {
        test = new FruitStorage();
        testList.add(new Apple("red", 100));
        testList.add(new Apple("red", 160));
        testList.add(new Apple("red", 200));
        testList.add(new Apple("green", 200));
        testList.add(new Apple("green", 90));
        testList.add(new Apple("green", 50));
        testList.add(new Apple("yellow", 50));
        testList.add(new Apple("yellow", 170));
    }

    public void testFindApplesByColorGreen() {
        assertEquals(3, test.findApples(testList, new PredicateForGreenApples()).size());
    }

    public void testFindApplesByColorRed() {
        assertEquals(3, test.findApples(testList, new PredicateForRedApples()).size());
    }

    public void testFindApplesByWeightLess() {
        assertEquals(4, test.findApples(testList, new PredicateForLightWeight()).size());
    }

    public void testFindApplesByWeightMore() {
        assertEquals(4, test.findApples(testList, new PredicateForHeavyApples()).size());
    }

    public void testFindApplesByColorGreenWeightMore() {
        assertEquals(1, test.findApples(testList, new PredicateForHeavyGreenApples()).size());
    }

    public void testFindApplesByColorGreenInAnonimClass() {
        ApplePredicate applePredicate = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("green");
            }
        };
        assertEquals(3, test.findApples(testList, applePredicate).size());
    }

    public void testFindApplesByColorRedInAnonimClass() {
        ApplePredicate applePredicate = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("red");
            }
        };
        assertEquals(3, test.findApples(testList, applePredicate).size());
    }

    public void testFindApplesByWeightHeavyInAnonimClass() {
        ApplePredicate applePredicate = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > AppleWeightConstance.SET_WEIGHT;
            }
        };
        assertEquals(4, test.findApples(testList, applePredicate).size());
    }

    public void testFindApplesByWeightLightInAnonimClass() {
        ApplePredicate applePredicate = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() <= AppleWeightConstance.SET_WEIGHT;
            }
        };
        assertEquals(4, test.findApples(testList, applePredicate).size());
    }

    public void testFindApplesByColorGreenInLiambda() {
        assertEquals(3, test.findApples(testList,
                (Apple apple) -> apple.getColor().equals("green")).size());
    }

    public void testFindApplesByColorRedInLiambda() {
        assertEquals(3, test.findApples(testList,
                (Apple apple) -> apple.getColor().equals("red")).size());
    }

    public void testFindApplesByWeightHeavyInLiambda() {
        assertEquals(4, test.findApples(testList,
                (Apple apple) -> apple.getWeight() > AppleWeightConstance.SET_WEIGHT).size());
    }

    public void testFindApplesByWeightLightInLiambda() {
        assertEquals(4, test.findApples(testList,
                (Apple apple) -> apple.getWeight() < AppleWeightConstance.SET_WEIGHT).size());
    }


}