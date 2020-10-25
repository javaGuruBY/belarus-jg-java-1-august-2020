package com.javaguru.student_vadim_migun.training.lesson_10;

import org.junit.Test;

import static org.junit.Assert.*;

public class AreaCalculatorTest {

    private AreaCalculator victim = new AreaCalculator();

    @Test
    public void shouldCalculateAreas(){
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("red", 10);
        shapes[1] = new Square("black", 30);
        shapes[2] = new Square("green", 20);

        double totalArea = victim.calculateTotalAreas(shapes);

        assertEquals(1614.16,totalArea,0.001);

    }

}