package lesson_3.level_5.task_21;

public class DogVersion1 {
    private String dogName;
    private String dogColor;
    private int dogAge;

    public DogVersion1(){}

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }
    void voice(){
        System.out.println("Woof!");
        System.out.println("Dog name: " + dogName);
        System.out.println("Dog color: " + dogColor);
        System.out.println("Dog age: " + dogAge);
    }
}
