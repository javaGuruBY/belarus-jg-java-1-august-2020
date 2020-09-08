package lesson_3.level_6.Task_24;

public class Escooter {
    String modelName;
    private double currentSpeed;
    private int maxSpeed;
//    private double increaseSpeed;
//    private double decreaseSpeed;
    private int weightDevice;
    private int maxLoad;
    private boolean lightOnOff = false;

    Escooter (String modelName, int maxSpeed, int weightDevice, int maxLoad){
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
        this.weightDevice = weightDevice;
        this.maxLoad = maxLoad;
    }

    boolean getLightOnOff() {
        return lightOnOff;
    }

    void setLightOnOff(boolean lightOnOff) {
        this.lightOnOff = lightOnOff;
    }

    double setSpeedUp(double increaseSpeed){
        currentSpeed += increaseSpeed;
        return currentSpeed;
    }

    double setSpeedDown(double decreaseSpeed){
        currentSpeed -= decreaseSpeed;
        return currentSpeed;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }
}
