package com.javaguru.student_sergey_kazyanin.lesson_3.level_6.Task24;

class PrinterDemo {
    public static void main(String[] args) {
        Printer printerHP = new Printer("HP 1020", "laser", true);
        Printer printerEpson = new Printer("FX-880", "matrix", false);

        printerHP.printerInfo();
        printerEpson.printerInfo();

        printerHP.printPage();
        printerHP.printPage();
        printerHP.printPage();
        printerHP.ScanOf();

        printerEpson.printPage();
        printerEpson.printPage();

        printerHP.printerInfo();
        printerEpson.printerInfo();

    }
}
