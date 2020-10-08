package com.javaguru.teacher.lesson_8.lessoncode;

class NoiseDetector {

    String detect(int noiseLevel) {
        if (noiseLevel <= 50) {
            return "Talk";
        }
        if (noiseLevel <= 60) {
            return "Office";
        }
        return "Airplane";
    }
}
