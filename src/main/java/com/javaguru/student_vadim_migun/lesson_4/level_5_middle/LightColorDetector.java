package com.javaguru.student_vadim_migun.lesson_4.level_5_middle;
/*
Разработать программу,
которая работает в соответствии с требованиями, описанными ниже.

Функциональные требования:
Программа должна определять цвет в зависимости
от длины волны в соответствии со следующими правилами:

380 ... 449 - Фиолетовый ("Violet")
450 ... 494 - Синий ("Blue")
495 ... 569 - Зеленый ("Green")
570 ... 589 - Желтый ("Yellow")
590 ... 619 - Оранжевый ("Orange")
620 ... 750 - Красный ("Red")
Вне диапазонов - невидимый спектр ("Invisible Light")

Логика с определением цвета должна быть реализована
в отдельном классе LightColorDetector:

class LightColorDetector {
​
  public String detect(int wavelength) {

  }

}
 */

class LightColorDetector {

    public String detect(int waveLength) {

        if (waveLength >= 380 && waveLength <= 449) {
            return "Violet";
        }
        if (waveLength >= 450 && waveLength <= 494){
            return  "Blue";
        }
        if (waveLength >= 495 && waveLength <= 569) {
            return "Green";
        }
        if (waveLength >= 570 && waveLength <= 589){
            return "Yellow";
        }
        if (waveLength >= 590 && waveLength <= 619){
            return "Orange";
        }
        if (waveLength >= 620 && waveLength <= 750){
            return "Red";
        } else {
            return "Invisible Light";
        }

    }

}
