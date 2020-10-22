package com.javaguru.student_vadim_migun.training.dmdev.inheritance;

import com.javaguru.student_vadim_migun.training.dmdev.interfaces.Printable;

class Computer implements Printable {

    private Ssd ssd;
    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {
        super();
        this.ssd = ssd;
        this.ram = ram;
    }

    public Computer() {
        System.out.println("Constructor computer");
    }

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }

    public void load(){
        System.out.println("Я загрузился");
    }

    @Override
    public void print() {
        System.out.println("Ssd " + ssd.getValue() + ", ram " + ram.getValue());
    }
}
