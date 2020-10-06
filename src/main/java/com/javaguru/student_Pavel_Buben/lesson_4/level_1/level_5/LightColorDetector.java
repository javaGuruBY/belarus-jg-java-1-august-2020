package com.javaguru.student_Pavel_Buben.lesson_4.level_1.level_5;

class LightColorDetector {
    public String detect(int waveLength) {
        String waveName = "";
        if (waveLength > 379 && waveLength <450){
            waveName = "Violet"; }
        if (waveLength > 449 && waveLength < 495) {
            waveName = "Blue";   }
        if (waveLength > 494 && waveLength < 570) {waveName = "Green";}
        if (waveLength > 569 && waveLength < 590) {waveName = "Yellow";}
        if (waveLength > 589 && waveLength < 620) {waveName = "Orange";}
        if (waveLength > 619 && waveLength < 751) {waveName = "Red";}
        if(waveLength < 380 && waveLength > 750) {waveName =  "Invisible Light";}
        return waveName;
    }
}

