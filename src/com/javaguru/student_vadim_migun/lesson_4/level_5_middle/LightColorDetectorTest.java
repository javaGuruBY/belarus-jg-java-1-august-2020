package com.javaguru.student_vadim_migun.lesson_4.level_5_middle;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest colorDetector = new LightColorDetectorTest();
        colorDetector.violetTest();
        colorDetector.blueTest();
        colorDetector.greenTest();
        colorDetector.yellowTest();
        colorDetector.orangeTest();
        colorDetector.redTest();
        colorDetector.invisibleTest();

    }

        public void violetTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(400);
        if (result.equals("Violet")) {
            System.out.println("Color is violet = OK");
        } else {
            System.out.println("Color is violet = FALSE");
        }
    }
    public void blueTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(480);
        if (result.equals("Blue")) {
            System.out.println("Color is blue = OK");
        } else {
            System.out.println("Color is blue = FALSE");
        }
    }
    public void greenTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(500);
        if (result.equals("Green")) {
            System.out.println("Color is green = OK");
        } else {
            System.out.println("Color is green = FALSE");
        }
    }
    public void yellowTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(580);
        if (result.equals("Yellow")) {
            System.out.println("Color is yellow = OK");
        } else {
            System.out.println("Color is yellow = FALSE");
        }
    }
    public void orangeTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(600);
        if (result.equals("Orange")) {
            System.out.println("Color is orange = OK");
        } else {
            System.out.println("Color is orange = FALSE");
        }
    }
    public void redTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(650);
        if (result.equals("Red")) {
            System.out.println("Color is red = OK");
        } else {
            System.out.println("Color is red = FALSE");
        }
    }
    public void invisibleTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(350);
        if (result.equals("Invisible Light")) {
            System.out.println("Color is invisible Light = OK");
        } else {
            System.out.println("Color is invisible Light = FALSE");
        }
    }


}

