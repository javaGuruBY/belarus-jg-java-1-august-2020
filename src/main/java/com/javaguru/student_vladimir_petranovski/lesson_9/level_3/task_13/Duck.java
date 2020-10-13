package com.javaguru.student_vladimir_petranovski.lesson_9.level_3.task_13;

class Duck extends Pet {
    public String name = "Vasia";
    private int age = 2;
    private String color = "black";
    private int weight;

    public Duck(String name, int age, String color, int weight) {
        super(name, age, color);
        this.weight = weight;
    }
    @Override
    public void voice() {
        System.out.println("Cria-cria");
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Pet duck = new Duck("Vasia", 2, "black", 3);
        System.out.println(duck.toString());
        duck.voice();
    }
}
