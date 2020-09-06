package lesson_3.level_5.task_21;

import java.util.Scanner;

public class DogDemoVersion1 {
    public static void main(String[] args) {
        String dogName, dogColor;
        int dogAge;

//        Dog newDog = new Dog(dogName; dogColor; dogAge); //создаём собаку

        Scanner variable = new Scanner(System.in);

        //ввод желаемых характеристик собаки (имя, цвет, возраст)
        System.out.println("Please insert dog name");
        dogName = variable.nextLine();

        System.out.println("Please insert dog color");
        dogColor = variable.nextLine();

        System.out.println("Please insert dog age");
        dogAge = variable.nextInt();

        DogVersion1 newDog = new DogVersion1(); //создаём собаку
        newDog.setDogName(dogName);
        newDog.setDogColor(dogColor);
        newDog.setDogAge(dogAge);

        System.out.println("Dog! Voice!");
        newDog.voice();
    }
}
