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


class MyDogDemo {
    public static void main(String[] args) {
        MyDog myDog = new MyDog("Rex",5, "black");
        myDog.voice();
        myDog.happyBirthday();
        myDog.changeColor ("White");
        myDog.changeName("Sharik");

    }

}


class MyDog {

    private String name;
    private int age;
    private String color;
    // private String newColor;
    // private String newName;

    public MyDog (String name, int age, String color){
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

    public void changeColor (String newColor) {    //public void changeColor(String newColor) {
        this.color = newColor;   // напишите тут команду сохранения нового цвета в свойство класса
        System.out.println("Change color: " + newColor);
    }

    public void changeName(String newName) {   // дополнительная команда от себя
        this.name = newName;
        System.out.println("New name: " + newName);
    }


}
