package lesson_3.level_5.task_21;

public class DogDemoVersion2 {
    public static void main(String[] args) {
        DogVersion2 newDog = new DogVersion2("Bobby", "red", 4); //создаём собаку

        System.out.println("Dog! Voice!");
        newDog.voice();
    }

}