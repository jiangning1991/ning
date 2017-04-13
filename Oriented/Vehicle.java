/**
 * Created by jiangning on 2017/4/6.
 */
public abstract class Vehicle {
    private String name;
    private double speed;
    private String color;

    public Vehicle(String name, double speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void run(){

    }
    public void stop(){

    }
}
