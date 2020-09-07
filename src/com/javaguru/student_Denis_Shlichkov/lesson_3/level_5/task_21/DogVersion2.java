package lesson_3.level_5.task_21;

public class DogVersion2 {
    private String dogName;
    private String dogColor;
    private int dogAge;

    public DogVersion2(String dogName, String dogColor, int dogAge){
        this.dogName = dogName;
        this.dogColor = dogColor;
        this.dogAge = dogAge;
    }

    void voice(){
        System.out.println("Woof!");
        System.out.println("Dog name: " + dogName);
        System.out.println("Dog color: " + dogColor);
        System.out.println("Dog age: " + dogAge);
    }
}
