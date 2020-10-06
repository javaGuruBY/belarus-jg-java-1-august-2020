/*
Выберите два разных объекта из реального мира.
Для каждого объекта выделите 2 - 3 самых важных
свойства и поведения, которое с этими свойствами
связано. Создайте для каждого объекта из реального
мира Java класс с его описанием. Создайте так же
Demo класс для каждого описанного вами объекта
и продемонстрируйте работу с объектом.
 */
package com.javaguru.student_sergey_kazyanin.lesson_3.level_6.Task24;

class Printer {
    private String modelName;
    private String printType;
    private boolean functionScan;
    private int pageCount;

    public Printer(String modelName, String printType, boolean functionScan) {
        this.modelName = modelName;
        this.printType = printType;
        this.functionScan = functionScan;
    }

    public void printPage() {
        pageCount++;
    }

    public void printerInfo() {
        String outText = "Printer model: " + this.modelName +
                "\nPrinter type: " + this.printType +
                "\nScan option: " + this.functionScan +
                "\nCount of page: " + this.pageCount + "\n";
        System.out.println(outText);
    }

    public void ScanOn() {
        this.functionScan = true;
    }

    public void ScanOf() {
        this.functionScan = false;
    }


}
