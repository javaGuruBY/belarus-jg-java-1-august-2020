package com.javaguru.student_vladimir_petranovski.lesson_10.level_4.task_11.service;

import com.javaguru.student_vladimir_petranovski.lesson_10.level_4.task_11.bean.Converter;

public class ConverterService {

    public float findDegreesKelvin(Converter converter) {
        return converter.getDegreesCelsius() + (float)273.15;
    }

    public float degreesFahrenheit(Converter converter) {
        return (converter.getDegreesCelsius() * 9 / 5) + (float)32;
    }
}
