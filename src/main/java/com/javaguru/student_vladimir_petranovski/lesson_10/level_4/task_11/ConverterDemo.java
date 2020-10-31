package com.javaguru.student_vladimir_petranovski.lesson_10.level_4.task_11;

import com.javaguru.student_vladimir_petranovski.lesson_10.level_4.task_11.bean.Converter;
import com.javaguru.student_vladimir_petranovski.lesson_10.level_4.task_11.service.ConverterService;

class ConverterDemo {
    public static void main(String[] args) {
        Converter converter = new Converter();
        converter.setDegreesCelsius(30);
        ConverterService converterService = new ConverterService();
        System.out.println(converterService.findDegreesKelvin(converter));
        System.out.println(converterService.degreesFahrenheit(converter));
    }
}
