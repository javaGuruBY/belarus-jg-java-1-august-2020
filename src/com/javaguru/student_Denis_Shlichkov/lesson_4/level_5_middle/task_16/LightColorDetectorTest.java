package lesson_4.level_5_middle.task_16;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.testViolet(382); //true
        lightColorDetector.testViolet(451); //false
        lightColorDetector.testBlue(451); //true
        lightColorDetector.testBlue(499); //false
        lightColorDetector.testGreen(500); //true
        lightColorDetector.testYellow(580); //true
        lightColorDetector.testOrange(594); //true
        lightColorDetector.testRed(750); //true
        lightColorDetector.testInvisible(760); //true
        lightColorDetector.testInvisible(379); //true
    }

    void testViolet(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Violet")) {
            System.out.println("LightColorDetector test - Violet = OK");
        } else {
            System.out.println("LightColorDetector test - Violet = FAIL");
        }
    }

    void testBlue(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result.equals("Blue")) {
            System.out.println("LightColorDetector test - Blue = OK");
        } else {
            System.out.println("LightColorDetector test - Blue = FAIL");
        }
    }

    void testGreen(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result.equals("Green")) {
            System.out.println("LightColorDetector test - Green = OK");
        } else {
            System.out.println("LightColorDetector test - Green = FAIL");
        }
    }

    void testYellow(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result.equals("Yellow")) {
            System.out.println("LightColorDetector test - Yellow = OK");
        } else {
            System.out.println("LightColorDetector test - Yellow = FAIL");
        }
    }

    void testOrange(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result.equals("Orange")) {
            System.out.println("LightColorDetector test - Orange = OK");
        } else {
            System.out.println("LightColorDetector test - Orange = FAIL");
        }
    }

    void testRed(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result.equals("Red")) {
            System.out.println("LightColorDetector test - Red = OK");
        } else {
            System.out.println("LightColorDetector test - Red = FAIL");
        }
    }

    void testInvisible(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result.equals("Invisible light")) {
            System.out.println("LightColorDetector test - Invisible light = OK");
        } else {
            System.out.println("LightColorDetector test - Invisible light = FAIL");
        }
    }
}