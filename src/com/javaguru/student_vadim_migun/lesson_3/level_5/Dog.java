package com.javaguru.student_vadim_migun.lesson_3.level_5;
/*
Создать класс собака (Dog)
и продемонстрировать его работу с ним в программе.

Бизнес требования:
- У собаки должна быть кличка.
- Кличку собаке дают в момент создания и потом ее изменить нельзя.
- Собака должна уметь выполнять команду голос (voice()),
при выполнении этой команды на консоль должно выводиться
кличка собаки три раза.

Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).
 */


class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.setName("Rex", 5, "black");
        myDog.voice();
        myDog.happyBirthday();
        myDog.changeColor("white");
        myDog.changeName("Sharik");

    }

}


class Dog {

    private String name;
    private int age;
    private String color;
    private String newColor;
    private String newName;

    public void setName(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void voice(){
        for(int i=0; i<3; i++){
        System.out.println(name + ", " + age + " year, " + color);

        }
    }
    public void happyBirthday(){
        this.age = age + 1;
        System.out.println("HappyBirthday: " + age + " year ");
    }

    public void changeColor(String newColor) { //public void changeColor(String newColor) {
        this.newColor = newColor;// напишите тут команду сохранения нового цвета в свойство класса
        System.out.println("Change color: " + newColor);
    }

    public void changeName(String newName) { // дополнительная команда от себя
        this.newName = newName;
        System.out.println("New name: " + newName);
    }


}
