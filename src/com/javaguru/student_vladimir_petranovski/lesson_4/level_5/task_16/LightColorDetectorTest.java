package com.javaguru.student_vladimir_petranovski.lesson_4.level_5.task_16;

class LightColorDetectorTest {
    public void detectTest1(){
        LightColorDetector test = new LightColorDetector();
        int waveLength = 390;
        if(390 >= 380 && 390 <= 449) {
            System.out.println(test.detect(390));
        }
    }
    public void detectTest2(){
        LightColorDetector test = new LightColorDetector();
        int waveLength = 478;
        if(478 >= 450 && 478 <= 494) {
            System.out.println(test.detect(478));
        }
    }
    public void detectTest3(){
        LightColorDetector test = new LightColorDetector();
        int waveLength = 501;
        if(501 >= 495 && 501 <= 569) {
            System.out.println(test.detect(501));
        }
    }
    public void detectTest4(){
        LightColorDetector test = new LightColorDetector();
        int waveLength = 587;
        if(587 >= 570 && 587 <= 589) {
            System.out.println(test.detect(587));
        }
    }
    public void detectTest5(){
        LightColorDetector test = new LightColorDetector();
        int waveLength = 590;
        if(590 >= 590 && 590 <= 619) {
            System.out.println(test.detect(590));
        }
    }
    public void detectTest6(){
        LightColorDetector test = new LightColorDetector();
        int waveLength = 632;
        if(632 >= 620 && 632 <= 750) {
            System.out.println(test.detect(632));
        }
    }
    public void detectTest7(){
        LightColorDetector test = new LightColorDetector();
        int waveLength = 771;
        if(771 >= 751) {
            System.out.println(test.detect(771));
        }
    }

    public static void main(String[] args) {
        LightColorDetectorTest test = new LightColorDetectorTest();
        test.detectTest1();
        test.detectTest2();
        test.detectTest3();
        test.detectTest4();
        test.detectTest5();
        test.detectTest6();
        test.detectTest7();
    }
}
