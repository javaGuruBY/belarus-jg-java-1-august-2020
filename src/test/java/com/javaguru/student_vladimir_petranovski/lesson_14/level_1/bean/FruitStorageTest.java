package com.javaguru.student_vladimir_petranovski.lesson_14.level_1.bean;

import com.javaguru.student_vladimir_petranovski.lesson_14.level_2.bean.Apple;
import junit.framework.TestCase;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

public class FruitStorageTest extends TestCase {

    private FruitStorage test;
    private final List<Apple> testList  = new ArrayList<>();

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

    public void testGetAllApples() {
        assertEquals(8, test.getAllApples().size());
    }

    public void testFindAllGreenApples() {
        assertEquals(3, test.findAllGreenApples().size());
    }

    public void testFindAllApplesByColorRed() {
        assertEquals(3, test.findAllApplesByColor("red").size());
    }

    public void testFindAllApplesByColorYellow() {
        assertEquals(2, test.findAllApplesByColor("yellow").size());
    }

    public void testFindAllApplesByWeight() {
        assertEquals(4, test.findAllApplesByWeight().size());
    }
}