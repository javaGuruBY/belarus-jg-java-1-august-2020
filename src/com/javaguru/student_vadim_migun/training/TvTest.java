package com.javaguru.student_vadim_migun.training;

class TvTest {
    public static void main(String[] args) {
        TvTest testRunner = new TvTest();
        testRunner.shouldIncreaseVolume();
        testRunner.shouldNotDecreaseVolumeWhenZero();
        testRunner.shouldNotIncreaseVolumeWhen30();


    }
    void shouldIncreaseVolume(){
        Tv tv = new Tv("LG");
        tv.increaseVolume();
        int actualResult = tv.getCurrentVolume();
        int expectedResult = 1;

        if (actualResult == expectedResult){
            System.out.println("ShouldIncreaseVolume: SUCCESS");
        } else {
            System.out.println("ShouldIncreaseVolume: FAILURE, expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
    void shouldNotDecreaseVolumeWhenZero(){
        Tv tv = new Tv("LG");
        tv.decreaseVolume();
        int actualResult = tv.getCurrentVolume();
        int expectedResult = 0;

        if (actualResult == expectedResult){
            System.out.println("ShouldDecreaseVolume: SUCCESS");
        } else {
            System.out.println("ShouldDecreaseVolume: FAILURE, expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
    void shouldNotIncreaseVolumeWhen30(){
        Tv tv = new Tv("LG");
        tv.setCurrentVolume(Tv.MAX_VOLUME);
        tv.increaseVolume();

        int actualResult = tv.getCurrentVolume();
        int expectedResult = Tv.MAX_VOLUME;

        if (actualResult == expectedResult){
            System.out.println("ShouldIncreaseVolume: SUCCESS");
        } else {
            System.out.println("ShouldIncreaseVolume: FAILURE, expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
