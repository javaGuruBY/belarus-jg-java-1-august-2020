package lesson_3.level_6.task_25;

class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
