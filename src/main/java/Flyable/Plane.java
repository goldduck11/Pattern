package Flyable;
import Moveable.*;

public abstract class Plane extends Car implements Flyable {
    private int z;

    @Override
    public void increase_height(int height) {
        this.z+=height;
    }

    @Override
    public void fly_to_the_point(int x, int y, int z) {
        super.go_To_The_Point(x,y);
        this.z = z;

    }


    public int getSpeed() {
        return super.getSpeed();
    }


    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    public int getFuel() {
        return super.getFuel();
    }

    public void setFuel(int fuel) {
        super.setFuel(fuel);
    }

}
