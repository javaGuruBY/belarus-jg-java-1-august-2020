package com.javaguru.student_vladimir_petranovski.lesson_10.level_4.task_11.bean;
/*
Сайт прогноза погоды на данный момент показывает
температуру в градусах по цельсию.
Для выхода на международный рынок сайту нужно
уметь конвертировать температуру в кельвины и форенгейты.
Попробуйте самостоятельно спроектировать (придумать)
и реализовать решение для данной задачи.
 */

public class Converter {
    private float degreesCelsius;

    public float getDegreesCelsius() {
        return degreesCelsius;
    }

    public void setDegreesCelsius(float degreesCelsius) {
        this.degreesCelsius = degreesCelsius;
    }

    @Override
    public String toString() {
        return "Converter{" +
                "degreesCelsius=" + degreesCelsius +
                '}';
    }
}
