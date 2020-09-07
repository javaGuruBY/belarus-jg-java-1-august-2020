package lesson_3.level_5.task_18;

public class Dog {
    private String dogName;

    Dog(String name) {
        dogName = name;
    }

    public String getDogName() {
        return dogName;
    }

    void voice(){
        for(int i = 0; i < 3; i++) {
            System.out.println(dogName);
        }
    }
}
