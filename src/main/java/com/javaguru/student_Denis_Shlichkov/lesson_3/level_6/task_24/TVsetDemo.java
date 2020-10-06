package com.javaguru.student_Denis_Shlichkov.lesson_3.level_6.task_24;

class TVsetDemo {
    public static void main(String[] args) {
        TVset samsungTV = new TVset();

        //увеличить уровень громкости телевизору
        samsungTV.setVolumePower(24);
        System.out.println("Volume level: " + samsungTV.getVolumePower());

        //переключение ТВ на канал номер 7
        samsungTV.setChannelNumber(7);
        System.out.println("Channel number is " + samsungTV.getChannelNumber());
    }
}
