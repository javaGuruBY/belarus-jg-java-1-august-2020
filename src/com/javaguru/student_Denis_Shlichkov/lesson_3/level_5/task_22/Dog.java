package lesson_3.level_5.task_22;

 class Dog {
    private String dogName;
    private String dogColor;
    private int dogAge;

    Dog(String dogName, String dogColor, int dogAge){
        this.dogName = dogName;
        this.dogColor = dogColor;
        this.dogAge = dogAge;
    }

    void voice(){
        System.out.println("Woof");
        System.out.println("Color: " + dogColor);
    }

    public void changeColor(String newColor) {
        this.dogColor = newColor;
    }
}
